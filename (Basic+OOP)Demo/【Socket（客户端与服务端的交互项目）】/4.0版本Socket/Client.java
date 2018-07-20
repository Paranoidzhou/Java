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

/**
 * 聊天室客户端
 * @author adminitartor
 *
 */
public class Client {
	/*
	 * java.net.Socket
	 * 套接字,封装了TCP协议.Socket提供了两条流
	 * 用来与服务端进行双向通讯.
	 */
	private Socket socket;
	/**
	 * 构造方法,用来初始化客户端
	 */
	public Client(){
		try {
			/*
			 * 实例化Socket就是连接服务端的过程
			 * 参数1:服务端地址
			 * 参数2:服务端开启的服务端口
			 * 
			 * 通过服务端IP地址可以找到服务端所处
			 * 计算机,再通过端口找到运行在服务端
			 * 计算机上的服务端应用程序.
			 */
			socket = new Socket("localhost",8088);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 客户端开始工作的方法
	 */
	public void start(){
		try {
			//先启动线程接收服务端发送的消息
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			
			
			Scanner scanner = new Scanner(System.in);
			/*
			 * Socket提供方法:
			 * OutputStream getOutputStream()
			 * 通过返回的字节输出流写出的数据会发送
			 * 给远端计算机,对于客户端这边而言远端
			 * 计算机就是服务端了.
			 */
			OutputStream out 
				= socket.getOutputStream();
			PrintWriter pw = new PrintWriter(
				new BufferedWriter(
					new OutputStreamWriter(
						out,"UTF-8"	
					)	
				),true	
			);				
			while(true){
				String line = scanner.nextLine();
				pw.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
	
	/**
	 * 该线程负责循环接收服务端发送过来的消息.
	 * 给服务端发送消息与接收服务端发过来的消息
	 * 要放在两个不同的线程要运行,这样才能做到
	 * 互相不干扰.
	 * @author adminitartor
	 *
	 */
	private class ServerHandler 
						implements Runnable{
		public void run(){
			try {
				BufferedReader br = new BufferedReader(
					new InputStreamReader(
						socket.getInputStream(),
						"UTF-8"
					)	
				);
				String message = null;
				while((message = br.readLine())!=null){
					System.out.println(message);
				}
			} catch (Exception e) {
				
			}
		}
	}
	
}








