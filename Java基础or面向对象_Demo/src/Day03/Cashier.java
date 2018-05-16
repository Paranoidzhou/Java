package Day03;
import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("请输入商品单价："+"￥");
		double unitPrice = scan.nextDouble();

		System.out.println("请输入商品数量："+"￥");
		double number = scan.nextDouble();

		System.out.println("请输入付钱金额："+"￥");
		double money = scan.nextDouble();

		double receivables/*总价*/= unitPrice/*单价*/ * number/*数量*/;

		if(receivables >= 500) {
			System.out.println("商品总价格为:"+receivables+"￥"); 
			System.out.println("您已购满500，已为您打八折后为："+(receivables *= 0.8)+"￥");
		}
		double change = money - receivables;
		if(money >= receivables) {
			System.out.println("应收金额为：￥"+receivables +",收钱：￥"+money+ ",找零为：￥"+change);
		}else {
			System.out.println("温馨提示：您给的钱不够，还差"+(receivables -money  ));
		}
	}
}