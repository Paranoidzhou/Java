package object;
/**
 * Object是所有类的超类.
 * 
 * 使用Point测试重写Object相关方法的规则.
 * @author adminitartor
 *
 */
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	/**
	 * toString方法是java API中最常被调用的方法.
	 * 通常我们定义的类都会重写这个方法.
	 * 
	 * 返回的字符串没有具体的格式要求,可结合将来实际
	 * 开发需求而定.
	 * 
	 * 原则上返回的字符串中应当包含当前对象属性信息.
	 * 
	 */
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
	/**
	 * 重写equals的目的是定义当前对象与给定的参数
	 * 对象比较内容是否相同.这里也没有严格要求必须
	 * 两个对象所有属性都必须完全相同,可以根据实际
	 * 开发情况而定.
	 */
	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		if(o == this){
			return true;
		}
		if(o instanceof Point){
			Point p = (Point)o;
			return this.x==p.x&&this.y==p.y;
		}
		return false;
	}
	
}















