package Day03;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 5 , s = 15 , d = 5;
		System.out.println(a < s && a > d);
		System.out.println(a >= s && s != d);
		System.out.println(a == d && a <= s);
		System.out.println(a >= s && a < d);
		System.out.println("----------------");
		System.out.println(a < s || a > d);
		System.out.println(a >= s || s != d);
		System.out.println(a == d || a <= s);
		System.out.println(a >= s || a < d);
		System.out.println("----------------");
		System.out.println(!( a > s ));
		System.out.println(!( a == d ));

		System.out.println(a < d && a++ >= d);
		System.out.println(a);
		System.out.println(a > d && ++a < s);

	}
}
