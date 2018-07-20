package day05;
//作业讲解
public class Homework {
	public static void main(String[] args) {
		//2.根据年份和月份，计算天数
		int year = 2001; //年
		int month = 4;   //月
		int days = 0;    //天数
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if((year%4==0 && year%100!=0) || year%400==0){
				days = 29;
			}else{
				days = 28;
			}
		}
		System.out.println("days="+days);
		
		
		
		
		
		
		
		
		
		
		/*
		//1.个人所得税:
		double salary = 10000.0; //工资
		double taxSalary = salary-3500; //计税工资
		double tax = 0.0; //税
		if(taxSalary<=0){
			tax = 0.0;
		}else if(taxSalary<=1500){
			tax = taxSalary*0.03-0;
		}else if(taxSalary<=4500){
			tax = taxSalary*0.1-105;
		}else if(taxSalary<=9000){
			tax = taxSalary*0.2-555;
		}
		System.out.println("tax="+tax);
		*/
	}
}


















