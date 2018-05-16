package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
 * 聊天室客户端
 */
public class Client {
	/**
	 *java.net.Socket
	 *套接字，封装了TCP协议。Socket提供了两条流用来与服务断进行双向通讯。 
	 */
	
	private Socket socket;
	/*构造方法用来初始化客户端*/
	public Client() {
		/*实例化Socket就是连接服务端的过程。
		 * 参数1：服务端地址
		 * 参数2：服务端开启的服务断口 
		 * 
		 *     通过服务端IP地址可以找到服务端所处计算机，再通过端口找
		 * 到运行在服务端计算机上的服务端应用程序。
		 */
		try {
			socket = new Socket("localhost",8088);   //参数1：  （localhost）本机  参数2：  端口   孙奇：192.168.28.196
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*客户端开始工作的方法*/
	public void start() {
		try {
			
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread (handler);
			t.start();
			
			
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(				  //PrintWriter （行刷新输出流）
					new BufferedWriter(                      //BufferedWriter（缓冲字符输出流）        
							new OutputStreamWriter(            //OutputStreamWriter（字符流转换为字节流）
									out,"UTF-8"
									)
							),true
					);
			Scanner scan = new Scanner(System.in);
			System.out.println("输入内容：");
			while(true) {
				
				String line = scan.nextLine();
					pw.println(line);	
					

				}
		}catch(Exception e) {
			e.printStackTrace();
		}


	}
	public static void main(String[] args) {
		Client client = new Client();   //初始化客户端
		client.start();					  //调用客户端开始工作
	}
	/*
	 *    该线程负责循环接收服务端发送过来的消息。给服务端发送消息与接收服务端
	 * 发过来的消息要放在两个不同的线程中运行，这样才能左到互相不干扰
	 */
	private class ServerHandler implements Runnable{
		public void run() {
			try {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(
								socket.getInputStream(),"utf-8"
								)
						);
				String message = null;
				while((message = br.readLine())!=null){
					System.out.println(message);
				}
			}catch(Exception e) {
				
			}
		}
	}
}
