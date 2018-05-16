package cn.tedu.shoot;

import java.awt.image.BufferedImage;

/** 子弹*/ 
public class Bullet extends FlyingObject {

	private static BufferedImage image;
	static {
		image = loadImage("bullet.png");
	}



	private int speed;     //子弹移动数度

	/** 构造方法*/
	public Bullet(int x ,int y){
		super(8,14,x,y);
		speed = 3;
	}
	public void step(){
		y -= speed;
	}
	/** 重写getImage()获取图片 */
	public BufferedImage getImage() {
		if(isLife()) {
			return image;
		}else if(isDead()) {
			state = REMOVE; 
		}
		return null;
	}
	/** 重写outOfBounds*/
	public boolean outOfBounds() {
		return this.y <= -this.height;   //子弹的y<=负的子弹的高，判定越界了。

	}
}
