package OO.Day04;

public class Test {

	public static void main(String[] args) {
		Student stu = new Student("张三",18,"河北","JSD1802_01");
		Person ps = new Student("张三三",18,"河南","JSD1802_02");
		stu.sayHi();
		ps.sayHi();
		 
		Teacher ls = new Teacher ("刘宇宙",21,"安徽",4396);
		Person ps1 = new Teacher("刘宇宙zhou",21,"安徽",6934);
		ls.sayHi();
		ps1.sayHi();
		 
		Doctor ys = new Doctor ("喀罗姆",25,"新疆","外科医生");
		Person ps2 = new Doctor("喀罗姆mu",25,"新疆","外科医生");
		ys.sayHi();
		ps2.sayHi();
		
		Doctor ys1 = new Doctor ("李大牛",26,"黑龙江","科室主任");
		Person ps3 = new Doctor("李大牛niu",26,"黑龙江","科室主任");
		ys1.sayHi();
		ps3.sayHi();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Student stu = new Student("张三",18,"河北","JSD1802_01");
		Student stu1 = new Student("李四",19,"陕西","JSD1802_02");
		Teacher tc = new Teacher("刘宇宙",20,"山西",4396);
		Teacher tc1 = new Teacher("孙海洋",21,"江苏",6324);
		Doctor dc = new Doctor("喀罗姆",22,"新疆","主治医生");
		Doctor dc1 = new Doctor("李大牛",23,"黑龙江","外科医生");
		stu.sayHi();
		stu1.sayHi();
		tc.sayHi();
		tc1.sayHi();
		dc.sayHi();
		dc1.sayHi();
		*/
		
		/**
		Person [] ps = new Person[9];
		ps[0] = new Student("张三",18,"河北","Jsd1802_01");
		ps[1] = new Student("李四",19,"山西","Jsd1802_02");
		ps[2] = new Student("王五",20,"陕西","Jsd1802_03");
		ps[3] = new Teacher("刘宇宙",21,"安徽",4396);
		ps[4] = new Teacher("孙海洋",22,"江苏",6324);
		ps[5] = new Teacher("张山峰",23,"湖北",7963);
		ps[6] = new Doctor("爱新永珍",24,"内蒙古","主治医生");
		ps[7] = new Doctor("喀罗姆",25,"新疆","外科医生");
		ps[8] = new Doctor("李大牛",26,"黑龙江","科室主任");
		for (int i = 0; i < ps.length; i++) {
			ps[i].sayHi();
		}
		*/
		
		/**
		Student [] stu = new Student[3];
		stu[0] = new Student("张三",18,"河北","Jsd1802_01");
		stu[1] = new Student("李四",19,"山西","Jsd1802_02");
		stu[2] = new Student("王五",20,"陕西","Jsd1802_03");
		for (int i = 0; i < stu.length; i++) {
			stu[i].sayHi();stu[i].sayHi1();
		}

		Teacher [] ls = new Teacher[3];
		ls[0] = new Teacher("刘宇宙",21,"安徽",4396);
		ls[1] = new Teacher("孙海洋",22,"江苏",6324);
		ls[2] = new Teacher("张山峰",23,"湖北",7963);
		for (int i = 0; i < ls.length; i++) {
			ls[i].sayHi();ls[i].sayHi1();
		}

		Doctor [] ys = new Doctor[3];
		ys[0] = new Doctor("爱新永珍",24,"内蒙古","主治医生");
		ys[1] = new Doctor("喀罗姆",25,"新疆","外科医生");
		ys[2] = new Doctor("李大牛",26,"黑龙江","科室主任");
		for (int i = 0; i < ys.length; i++) {
			ys[i].sayHi();ys[i].sayHi1();

		}
       */
	}

}
