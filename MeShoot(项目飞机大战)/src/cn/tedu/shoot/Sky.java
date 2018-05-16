package cn.tedu.shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/** 天空*/
public class Sky extends FlyingObject{

	private static  BufferedImage image;
	static {
		image = loadImage("background.png");
	}
	private int y1;			//第二张天空图片的Y坐标	
	private int speed;     //天空移动数度

	/** 构造方法 */
	public Sky (){
		super(World.WIDTH,World.HEIGHT,0,0);
		y1=-World.HEIGHT;
		speed = 1;
	}
	/** 重写step()方法*/
	public void step(){
		y += speed;                  //Y+表示向下   Y-表示向上
		y1 += speed;
		if(y >= World.HEIGHT) {
			y = -World.HEIGHT;
		}
		if(y1 >=World.HEIGHT ) {
			y1 = -World.HEIGHT;
		}
	}
	/** 重写getImage()获取图片 */
	public BufferedImage getImage() {
		return image;
	}
	/** 重写paintObject()画对象*/
	public void paintObject(Graphics g) {
		g.drawImage(getImage(),x,y,null);
		g.drawImage(getImage(),x,y1,null);
	}
	 /** 重写outOfBounds*/
		public boolean outOfBounds() {
			return false;                  //永不越界
		}
}
