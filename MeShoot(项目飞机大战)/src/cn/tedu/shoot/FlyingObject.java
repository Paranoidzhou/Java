package cn.tedu.shoot;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.Random;
import java.awt.Graphics;

/**     飞行物       */
public abstract class FlyingObject {
	/** */
	public static final int LIFE = 0;			//活着的
	public static final int DEAD = 1;			//死了的(未删除)
	public static final int REMOVE = 2;			//删除的
	protected int state = LIFE;					

	protected int width;		
	protected int height;		
	protected int x;			
	protected int y;	

	/** 专门给英雄机，子弹，天空提供的*/
	public FlyingObject(int width,int height,int x,int y){
		this.width  = width;
		this.height = height;
		this.x = x;
		this.y = y;

	}

	/** 专门给小敌机，大敌机，小蜜蜂提供的*/
	public FlyingObject(int width, int height){
		this.width = width;
		this.height=height;
		Random rand = new Random();
		x = rand.nextInt(World.WIDTH-this.width);  //0到400减小敌机的宽度之间的随机数
		y = -this.height;//负的小敌机的高
	}

	/** 飞行物移动(抽象方法)*/
	public abstract void step();

	/** 读图片*/
	public static BufferedImage loadImage(String fileName){
		try {
			BufferedImage img =ImageIO.read(FlyingObject.class.getResource(fileName)) ; //同包中读图片。
			return img;
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	/** 获取图片*/
	public abstract BufferedImage getImage();

	/**  判断是否活着的*/
	public boolean isLife() {
		return state == LIFE;
	}
	/**  判断是否死了的*/
	public boolean isDead() {
		return state == DEAD;
	}
	/**  判断是否删除的*/
	public boolean isRemove() {
		return state == REMOVE;
	}
	/** 专门画对象的*/
	public void paintObject(Graphics g) {
		g.drawImage(getImage(),x,y,null);
	}
	/** 越界检查*/
	public abstract boolean outOfBounds();
	/** 检测敌人与子弹（英雄机的碰撞）*/
	public boolean hit(FlyingObject other) {
		int x1 = this.x-other.width;
		int x2 = this.x+this.width;
		int y1 = this.y-other.height;
		int y2 = this.y+this.height;
		int x = other.x;
		int y = other.y;
		return x >= x1 && x <= x2 && y >= y1 && y <= y2;
	}
	/** 飞行物去死*/
	public void goDead() {
		state = DEAD;	//将当前状态修改为DEAD
	}
}

