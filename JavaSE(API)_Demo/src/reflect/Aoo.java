package reflect;

public class Aoo {
	static{
		//System.out.println("静态块在加载类时运行");
	}
	String name = "流星雨";
	String add = "北京";
	
	public void gohome() {
		System.out.println("困得要死，回家睡觉～～");
	}
	private String yanzhong() {
		return add+"空气重度污染！！！";
	}
	public String whoru() {
		System.out.println("这句话输出了！！！");
		return "I am  "+name;
	}
	private void wru() {
		
		System.out.println("I am  "+name); ;
	}
}