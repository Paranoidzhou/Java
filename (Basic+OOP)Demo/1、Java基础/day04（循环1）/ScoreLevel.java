package day04;
//成绩等级判断
public class ScoreLevel {
	public static void main(String[] args) {
		int score = 95;
		
		if(score<0 || score>100){
			System.out.println("成绩不合法");
		}else if(score>=90){ //score>=0 && score<=100
			System.out.println("A-优秀");
		}else if(score>=80){
			System.out.println("B-良好");
		}else if(score>=60){
			System.out.println("C-中等");
		}else{
			System.out.println("D-不及格");
		}
		
		
	}
}



























