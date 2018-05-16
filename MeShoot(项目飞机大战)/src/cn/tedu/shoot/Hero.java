package cn.tedu.shoot;

import java.awt.image.BufferedImage;

/** 英雄机 */
public class Hero extends FlyingObject {

	private static BufferedImage [] images ;
	static {
		images = new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("hero"+i+".png");
		}
	}

	private int life;          //英雄机生命值
	private int doubleFire;    //英雄机火力  

	public Hero(){
		super (97,124,140,400);
		life = 3;
		doubleFire = 0;
	}

	/** 英雄机随着鼠标移动 x,y:鼠标的x和y坐标*/
	public void moveTo(int x , int y) {
		this.x = x - this.width/2;			//英雄机的x=鼠标的x减一半英雄机的宽
		this.y = y - this.height/2;		//英雄机的y=鼠标的y减一半英雄机的高

	}
	public void step(){}

	int index = 0;
	/** 重写getImage()获取图片*/
	public BufferedImage getImage() {
		if(isLife()) {
			return images[index++%2];        //取余二，得0或者1     取余三，得0，1，2     取与100， 得0，1，2....99
		}
		return null;
	}
	/** 英雄机发射子弹*/
	public Bullet[] shoot() {
		int xStep = this.width/4;
		int yStep = 10;
		if(doubleFire > 0) {   //双倍火力
			Bullet [] bs = new Bullet[2];
			bs [0] = new Bullet(this.x+1*xStep,y-yStep);
			bs [1] = new Bullet(this.x+3*xStep,y-yStep);
			doubleFire -= 2 ;  //发射一次双倍火力，火力值-2。
			return bs;
		}else {					 //单倍火力
			Bullet [] bs = new Bullet[1];
			bs [0] = new Bullet(this.x+2*xStep,y-yStep);
			return bs;
		}
	}
	/**           
	 *                       index = 0;
	 * 10 return images[0]   index = 1;
	 * 20 return images[1]   index = 2;
	 * 30 return images[0]   index = 3;
	 * 40 return images[1]   index = 4;
	 * 50 return images[0]   index = 5;
	 * ...return images[0/1]  index = ...;
	 */
	 /** 重写outOfBounds*/
	public boolean outOfBounds() {
		return false;							//永不越界
	}
	public void addLife() {
		life++;   		  //生命值增一
	}
	public void addDoubleFire() {
		doubleFire+=40;  //火力值增40
	}
	public int getLife() {
		return life;
	}
	public int doubleFire() {
		return doubleFire;
	}
	public void subtractLife() {
		life--;
	}
	public void clearDoubliFire() {
		 doubleFire = 0;
	}
}
