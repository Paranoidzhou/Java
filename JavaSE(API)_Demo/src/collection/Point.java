package collection;
/*
 * 作为集合元素测试使用：
 */
public class Point implements Comparable<Point>{
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
	};
	
	public String toString() {
		
		return "("+x+","+y+")";
	}
	public boolean equals(Object o) {  //重写equals用于判断内容是否相等
		if(o == null) {
			return false;
		}
		if(o == this) {
			return true;
		}
		if (o instanceof Point) {
			Point p = (Point)o;
			return p.x == this.x && p.y == this.y;
		}
		return false;
	}
	/*
	 *    实现Comparable接口后，要求必须重写该方法，该方法的意义是定义当前对象与参数
	 * 对象的大小关系。
	 *    返回值不关注具体取值，只关注取值范围:
	 *    当返回值 > 0：当前对象this大于参数对象o  this > o ;
	 *    当返回值 < 0：当前对象this小与参数对象o  this < o ;
	 *    当返回值 = 0：当前对象this等于参数对象o  this = o ;
	 */
	public int compareTo(Point o) {
		//点到圆点距离长的大
		int len = this.x *this.x + this.y * this.y;
		int olen = o.x * o.x + o.y + o.y;
		return len - olen;
	}
}
