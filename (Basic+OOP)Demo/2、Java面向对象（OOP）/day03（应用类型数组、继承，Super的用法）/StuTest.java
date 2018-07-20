package oo.day03;
//引用类型数组测试类
public class StuTest {
	public static void main(String[] args) {
		Stu[] stus = new Stu[3]; //创建Stu数组对象
		stus[0] = new Stu("zhangsan",25,"LF"); //创建Stu对象
		stus[1] = new Stu("lisi",26,"JMS");
		stus[2] = new Stu("wangwu",28,"SD");
		System.out.println(stus[1].age); //26
		for(int i=0;i<stus.length;i++){
			System.out.println(stus[i].name);
			stus[i].sayHi();
		}
		
		Stu[] ss = new Stu[]{
			new Stu("zhangsan",25,"LF"),
			new Stu("lisi",26,"JMS"),
			new Stu("wangwu",28,"SD")
		};
		
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[2];
		arr[1][0] = 100;
		
		int[][] as = new int[3][4];
		for(int i=0;i<as.length;i++){
			for(int j=0;j<as[i].length;j++){
				as[i][j] = 100;
			}
		}
		
	}
}
















