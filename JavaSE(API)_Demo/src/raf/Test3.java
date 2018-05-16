package raf;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*
 * 查询用户功能
 * 
 * 程序启动后，要求输入要查询的用户名
 * 然后将该用户信息输出，格式为：user,pwd,nick,age
 * 若输入的用户在user.dat文件不存在，则提示差无此人。
 */
public class Test3 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String username = null;
		while(true) {
			System.out.println("请输入需要查询的用户名：");
			username = scan.nextLine().trim();	
			if(username.length()>0) {
				break;
			}
			System.out.println("用户名不能为空！");
		}
		RandomAccessFile raf = new RandomAccessFile ("user.dat","r");	
		
		boolean have = false;
		for (int i = 0; i < raf.length()/100; i++) {
			raf.seek(i*100);
			byte [] data = new byte[32];
			raf.read(data);
			String name = new String (data,"UTF-8").trim();
			if(name.equals(username)) {
				raf.read(data);
				String pwd = new String(data,"UTF-8").trim();
				raf.read(data);
				String nick = new String(data,"UTF-8").trim();
				int age = raf.readInt();
				System.out.println(name+","+pwd+","+nick+","+age);
				have = true;
				break;
			}	
		}
		if(!have) {
			System.out.println("查无此人！");
		}
		raf.close();
	}
	
}
