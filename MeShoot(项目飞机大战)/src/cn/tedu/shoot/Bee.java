package cn.tedu.shoot;

import java.awt.image.BufferedImage;

import java.util.Random;

/** 小蜜蜂*/
public class Bee extends FlyingObject implements Award{
	private static BufferedImage [] images;
	static {
		images = new BufferedImage [5];
		for (int i = 0; i < images.length; i++) {
			images [i]  = loadImage("bee"+i+".png");
		}

	}

	private int xSpeed;     	//小蜜蜂X坐标移动数度
	private int ySpeed;     	//小蜜蜂Y坐标移动数度
	private int awardType;  	//小蜜蜂的奖励类型（0或者1）

	/** 构造方法*/
	public Bee(){
		super (60,50);
		xSpeed = 1;
		ySpeed = 2;
		Random rand = new Random();
		awardType = rand.nextInt(2);//0到1之间的随机数（写几就不包括几）
	}
	public void step(){
		x += xSpeed;                  
		y += ySpeed;                  //Y+表示向下   Y-表示向上
		if(x <= 0 || x >= World.WIDTH-this.width){
			xSpeed *=-1;
		}
	}
	int index = 1;
	/** 重写getImage()获取图片*/
	public BufferedImage getImage() {
		if(isLife()) {
			return images[0]; 
		}else if(isDead()) {
			BufferedImage img = images [index++];
			if(index == images.length) {
				state = REMOVE;
			}
			return img;
		}
		return null;
	}
	/**
	 * 							 index = 1;
	 * 10  img = images[1]   index = 2;  return  (images[1])    
	 * 20  img = images[2]   index = 3;  return  (images[2])
	 * 30  img = images[3]   index = 4;  return  (images[3])
	 * 40  img = images[4]   index = 5;  return  (images[4])
	 * 50  return null;  
	 */
	/** 重写outOfBounds*/
	public boolean outOfBounds() {
		return this.y >= World.HEIGHT;   // 小蜜蜂的y大于或等于窗口高度，判定越界了。
	}
	/** 重写getType奖励类型*/
	public int getType() {
		return awardType;
	}
}
