package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 聊天室服务端*/
public class Server {
	/* 
	 * 运行在服务端的ServerSocket由两个主要作用：
	 * 1：向系统申请对外的服务端口，客户端就是通过这个端口与服务端建立连接的。
	 * 2：监听服务端口，等待客户端连接。一旦一个客户端通过Socket与服务端建立连接，
	 * 那么ServerSocket会创建一个Socket与该客户端通讯。
	 */
	private ServerSocket server;
	private int i;
	
	//该数组用于存放所有客户端的输出流
   //	private PrintWriter [] allOut = new PrintWriter[0];
	private List<PrintWriter> allOut = new ArrayList<PrintWriter>();

	/*服务端初始化*/
	public Server() {
		try {
			/*
			 * 创建ServerSocket的同时向系统申请对外的服务端口。
			 * 注意：该端口不能和其他程序冲突，否则会抛出地址被占用的异常。
			 */ 
			server = new ServerSocket(8088);
		} catch (IOException e) {
			System.out.println("该端口已经被占用！");
			e.printStackTrace();
		}  
	}
	/*服务端开始工作的方法*/
	public void start() {
		try {
			/*	
			 * ServerSocket提供方法：
			 *	Socket accept()
			 *	   该方法时一个阻塞方法，调用后即等待客户端的连接，一旦一个客户端通过端口连接，那么
			 *	accept方法会返回一个Socket实例，通过这个Socket实例就可以与刚连接的客户端交互了。
			 */	 

			while(true) {
				System.out.println("等待客户端连接Loding......");
				Socket socket = server.accept();
				i++;
				System.out.println("第"+i+"个客户端连接了");
				
				// 启动一个线程，处理该客户端交互工作
				ClientHandler handler = new ClientHandler(socket,i);

				Thread t = new Thread(handler);

				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    /*服务端入口*/
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

	//定义了一个内部类:该线程任务负责与指定Socket所对应的客户端进行交互。
	private class ClientHandler implements Runnable{

		//当前线程通过这个socket与对应客户端交互
		private Socket socket;
		private int i ;
		//实例化时将对应客户端的Socket传入
		public ClientHandler(Socket socket , int i){
			this.socket = socket;
			this.i = i;
		}

		public void run() {
			PrintWriter pw = null;
			try {
				InputStream in = socket.getInputStream();
				BufferedReader br = new BufferedReader(  //BufferedReader（缓冲字符流，先把字符读到缓存里）
						new InputStreamReader(				  //InputStreamReader(读取字节将其转换为字符)
								in,"UTF-8"
								)
						);
				//获取输出流，用户给当前客户端回复消息
				pw = new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(
										socket.getOutputStream(
												),"UTF-8"
										)	
								),true
						);

				synchronized(allOut) {
					//将当前客户端对应的输出流存入共享数组
					//1、扩容数组
					//allOut =	Arrays.copyOf(allOut,allOut.length+1);	
					//2、将输出流存入数组
					//allOut[allOut.length-1] = pw;
					
					allOut.add(pw);
				}
				/*
				 *客户端再断开连接时不同系统有不同反应:
				 * linux的客户端断开之后，br.readLine方法会返回null. 
				 * windows的客户端断开连接后，br.readLine方法会直接抛出异常。 
				 */
				String message = null;
				while((message = br.readLine())!=null) {
					System.out.println("第"+i+"客户端说："+message);
					//回复客arg0户端
					//pw.println("客户端说："+message);
					//发送给所有客户端
					synchronized(allOut) {
//						for (int i = 0; i < allOut.length; i++) {
//							allOut[i].println("第"+this.i+"个客户端的回复:"+message);
//						}
						for(PrintWriter o : allOut) {
							o.println("第"+this.i+"个客户端的回复:"+message);
						}
					}
				}
			} catch (Exception e) {
				
			} finally {
				//处理客户端断开连接后的操作	
				/** 
				 * 1、将该客户端的输出流从共享数组中删除
				 */
				synchronized(allOut) {
//					for (int i = 0; i < allOut.length; i++) {
//						if(allOut [i] == pw) {
//							//将最后一个元素放入当前位置
//							allOut[i] = allOut[allOut .length-1];
//							//缩容
//							allOut = Arrays.copyOf(allOut, allOut.length-1);
//							break;
//						}
//					}
					allOut.remove(pw);
				}
				/**
				 * 2、客户端断开连接后，服务端关闭该客户端Socket,释放资源
				 */
				try {
					System.out.println("客户端"+i+"断开.....");
					socket.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}	
}