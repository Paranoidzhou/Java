 package cn.tedu.shoot;

import java.awt.image.BufferedImage;

/** 大敌机*/
public class BigAirplane extends FlyingObject implements Enemy{

	private static BufferedImage [] images;
	static {
		images = new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("bigplane"+i+".png");
		}
	}

	private int speed;     //大敌机移动数度

	/** 构造方法*/
	public BigAirplane(){
		super(69,99);
		speed = 2;
	}
	public void step(){
		y += speed;                  //Y+表示向下   Y-表示向上
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
		return this.y >= World.HEIGHT;   // 大敌机的y大于或等于窗口高度，判定越界了。
	}
	public int getScore() {
		return 3;
	}
}