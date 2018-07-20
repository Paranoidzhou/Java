package exception;
/**
 * java异常捕获机制中的try-catch
 * 
 * 语法:
 * try{
 * 	代码片段
 * }catch(XXException e){
 * 	捕获try代码片段中出现的XXException并处理
 * }
 * @author adminitartor
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try{
			String str = "a";
			/*
			 * 当JVM运行程序是发现出现了某个异常时
			 * 会自动实例化该类型的异常实例,并将代码
			 * 执行过程设置到该异常实例中将其抛出.
			 * 
			 * 若抛出异常的代码没有被异常处理机制包含
			 * 那么JVM会将该异常抛到当前方法之外,若
			 * 抛出到main方法之外,则当前程序中断.
			 * (单线程情况下)
			 */
			System.out.println(str.length());
			
			System.out.println(str.charAt(0));
			
			System.out.println(Integer.parseInt(str));
			
			//try中出错代码以后的内容都不会再执行
			System.out.println("!!!!");
			
			
		}catch(NullPointerException e){
			System.out.println("出现了空指针!");
		
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("下标越界了!");
		/*
		 * 应当养成一个好习惯,在最后一个catch捕获
		 * Exception,防止因为未捕获的异常导致程序
		 * 中断
		 */
		}catch(Exception e){
			System.out.println("反正就是出了个错!");
		}
		
		System.out.println("程序结束了");
	}
}









