package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 聊天室服务端
 * @author adminitartor
 *
 */
public class Server {
	/*
	 * 运行在服务端的ServerSocket
	 * 有两个主要作用:
	 * 1:向系统申请对外的服务端口,客户端就是通过
	 *   这个端口与服务端建立连接的.
	 * 2:监听服务端口,等待客户端连接.一旦一个客户端
	 *   通过Socket与服务端建立连接,那么ServerSocket
	 *   会创建一个Socket与该客户端通讯.  
	 */
	private ServerSocket server;
	
	public Server(){
		try {
			/*
			 * 创建ServerSocket的同时向系统申请
			 * 对外的服务端口.注意,该端口不能和
			 * 其他程序冲突,否则会抛出地址被占用
			 * 的异常.
			 */
			server = new ServerSocket(8088);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start(){
		try {
			/*
			 * ServerSocket提供方法:
			 * Socket accept()
			 * 该方法是一个阻塞方法,调用后即等待
			 * 客户端的连接,一旦一个客户端通过
			 * 端口连接,那么accept方法会返回一个
			 * Socket实例,通过这个Socket实例就
			 * 可以与刚连接的客户端交互了
			 */
			System.out.println("等待客户端连接...");
			Socket socket = server.accept();
			System.out.println("一个客户端连接了!");
			
			InputStream in = socket.getInputStream();
			BufferedReader br = new BufferedReader(
				new InputStreamReader(
					in,"UTF-8"	
				)	
			);
			
			String message = br.readLine();
			System.out.println("客户端说:"+message);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
}







