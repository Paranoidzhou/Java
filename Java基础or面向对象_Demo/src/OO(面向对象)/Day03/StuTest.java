package OO.Day03;

import java.util.Arrays;

public class StuTest {

	public static void main(String[] args) {
		
		Stu [] stus = new Stu[3];
		stus [0] = new Stu ("渣渣辉,",10,"砍我!");
		stus [1] = new Stu ("陈小春,",10,"砍我!");
		stus [2] = new Stu ("古天乐,",10,"砍我!");//若少一个参数，则会为空值（报错个空指针异常）
		System.out.println(stus[0].name);
		
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].name);
			stus[i].sayHi();
		}
		
		/*
		Stu [] stu  = {
			new stu( "渣渣辉",10,"砍我！"),
			new stu("陈小春",10,"砍我！"),
			new stu("古天乐",10,"砍我！")
		};
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].name);
			stus[i].sayHi();
		}
		*/
		int [] [] arr = new int [3] [];
		arr [0] = new int [2];
		arr [1] = new int [3];
		arr [2] = new int [2];
		arr [1][0] = 250;
		System.out.println(arr[1][0]);
		
		int [] [] as =  new int[3] [4];
		for (int i = 0; i <as.length; i++) {
			for (int j = 0; j < as[i].length; j++) {
				as [i][j] = 100;
				System.out.println((as[i][j]));
			}
		}
		
	}

}
