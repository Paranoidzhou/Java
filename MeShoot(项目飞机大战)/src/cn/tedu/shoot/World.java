package cn.tedu.shoot;

import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.util.Arrays;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/** 整个世界*/
public class World extends JPanel {
	public static final int WIDTH = 400;          //表示窗口宽
	public static final int HEIGHT = 700;         //表示窗口高
	
	public static final int START = 0;            //启动状态
	public static final int RUNNING = 1;          //运行状态
	public static final int PAUSE = 2;				 //暂停状态
	public static final int GAME_OVER = 3;			 //游戏结束状态
	private int state = START;                    //当前状态（默认为启动状态）

	private static  BufferedImage start;
	private static  BufferedImage pause;
	private static  BufferedImage gameover;
	static {
		start = FlyingObject.loadImage("start.png");
		pause = FlyingObject.loadImage("pause.png");
		gameover = FlyingObject.loadImage("gameover.png");
	}



	private	Sky sky  = new Sky();                //天空
	private Hero hero = new Hero();			       //英雄机
	private FlyingObject [] enemies = {} ;		 //敌人数组（小敌机，大敌机，小蜜蜂）
	private Bullet[] bullets = {};					 //子弹数组 

	/** 生成小敌机，大敌机，小蜜蜂敌人类型*/
	public FlyingObject nextOne() {
		Random rand = new Random();
		int type = rand.nextInt(20);
		if(type<10) {
			return new Airplane();
		}else if(type <16) {
			return new BigAirplane();
		}else {      
			return new Bee();
		}
	}
	int enterIndex = 0;
	public void enterAction() {
		enterIndex++;
		if(enterIndex %40 == 0) {
			FlyingObject obj = nextOne();
			enemies = Arrays.copyOf(enemies,enemies.length+1);
			enemies [enemies.length-1] = obj ;
		}
	}
	int shootIndex = 0;
	/** 子弹入场*/
	public void shootAction() {
		shootIndex++;
		if(shootIndex %30 ==0) {
			Bullet[] bs = hero.shoot();
			bullets = Arrays.copyOf(bullets,bullets.length +bs.length);
			System.arraycopy(bs, 0, bullets, bullets.length-bs.length, bs.length);
		}
	}
	/** 飞行物移动*/
	public void stepAction() {
		sky.step();
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].step();
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].step();
		}
	}
	/** 删除越界的飞行物(敌人)*/
	public void outOfBounds() {
		int index = 0;
		FlyingObject [] enemyLives = new FlyingObject [enemies.length];
		for (int i = 0; i < enemyLives.length; i++) {
			FlyingObject f = enemies [i];
			if(!f.outOfBounds() && !f.isRemove()) {
				enemyLives[index] = f;
				index++;
			}
		}

		enemies = Arrays.copyOf(enemyLives, index);

		index = 0;
		Bullet [] bulletLives = new Bullet [bullets.length];
		for (int i = 0; i < bullets.length; i++) {
			Bullet b = bullets [i];
			if(!b.outOfBounds() && !b.isRemove()) {
				bulletLives[index] = b;
				index++;
			}
		}

		bullets = Arrays.copyOf(bulletLives,index);
	} 
	int score = 0;//得分
	public void bulletBangAction(){  
		for (int i = 0; i < bullets.length; i++) {
			Bullet b = bullets[i];
			for (int j = 0; j < enemies.length; j++) {
				FlyingObject f = enemies[j];
				if(b.isLife() && f.isLife() && f.hit(b) ) {
					b.goDead();  //子弹去死
					f.goDead();	 //敌人去死
					if (f instanceof Enemy){
						Enemy en = (Enemy) f;
						score += en.getScore();
					}
					if(f instanceof Award){
						Award aw = (Award)f;
						int type = aw.getType();
						switch(type){
						case Award.DOUBLE_FIRE:
							hero.addDoubleFire();
							break;
						case Award.LIFE:
							hero.addLife();
							break;
						}
					}
				}
			}
		}
	}
	/** 英雄机与敌人的碰撞*/
	public void heroBangAction() {
		for (int i = 0; i < enemies.length; i++) {
			FlyingObject f = enemies[i];
			if(hero.isLife() && f.isLife() && f.hit(hero)){
				f.goDead();        
				hero.subtractLife();
				hero.clearDoubliFire();
			}
			
		}
	}
	public void checkGameOverAction() {
		if(hero.getLife() <= 0) {
			state = GAME_OVER;
		}
	}

	public void action() {
		MouseAdapter l = new MouseAdapter() {      //鼠标侦听器	
			/** 重写mouseMoved()鼠标移动*/
			public void mouseMoved(MouseEvent e) {
				if(state == RUNNING) {
					int x = e.getX();				//获取鼠标x坐标
					int y = e.getY();				//获取鼠标Y坐标
					hero.moveTo(x, y);	
				}

			}
			/** 重写mouseClicked()鼠标点击*/
			public void mouseClicked(MouseEvent e) {
				switch(state) {
				case START:
					state = RUNNING;
					break;
				case GAME_OVER:
					score = 0;
					sky = new Sky();
					hero = new Hero();
					enemies = new FlyingObject [0];
					bullets = new Bullet[0];
					state = START;
				}
			}
			public void mouseExited (MouseEvent e) {
				if(state == RUNNING) {
					state = PAUSE;
				}	
			}
			public void mouseEntered( MouseEvent e){
				if(state == PAUSE) {
					state = RUNNING;
				}
			}	
		};		


		this.addMouseListener(l);						 //处理鼠标操作事件
		this.addMouseMotionListener(l);				 //处理鼠标滑动事件

		Timer timer = new Timer();       //定时器对象
		int interval = 5;               //时间间隔(以毫秒为单位)
		timer .schedule(new TimerTask() {
			public void run() {           //定时干的事（每10个毫秒走一次）
				if(state == RUNNING){
					enterAction();					//敌人（小敌机，大敌机，小蜜蜂）
					shootAction();					//子弹入场		
					stepAction();					//飞行物移动
					outOfBounds();			      //删除越界
					bulletBangAction();			//子弹与敌人的碰撞
					heroBangAction();          //英雄机与敌人的碰撞
					checkGameOverAction();     //检测游戏结束
				}		
				repaint();						//重画（重新调用paint()画）
			}
		},interval,interval);		   	//定时计划

	}

	/** 重写paint() g:画笔*/
	public void paint(Graphics g) {
		sky.paintObject(g);
		hero.paintObject(g);
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].paintObject(g);
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].paintObject(g);
		}
		g.drawString("当前得分："+score,10,28);
		g.drawString("生命值:"+hero.getLife() , 10,39);
		g.drawString("火力值:"+hero.doubleFire(), 10, 50);

		switch (state) {
		case START:
			g.drawImage(start, 0, 0,null);
			break;
		case PAUSE:
			g.drawImage(pause, 0, 0,null);
			break;
		case GAME_OVER:
			g.drawImage(gameover, 0, 0,null);
			break;
		}

	}


	public static void main(String[] args) {
		JFrame frame = new JFrame();
		World world = new World();
		frame.add(world);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			  //设置关闭窗口
		frame.setSize(WIDTH, HEIGHT);                                 //设置窗口大小
		frame.setLocationRelativeTo(null); 									  //这是窗口居中显示
		frame.setVisible(true); 												  //1)设置窗口可见 2）尽快调用paint()方法

		world.action();															  //启动执行
		System.gc();
	}
}
