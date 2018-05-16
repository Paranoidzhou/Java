package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 对象流：
 * 对象流是一对高级流，可以方便我们将Java中任何对象进行读写操作。
 * 
 * java.io.ObjectOutputStream
 * 对象输出流，可以将对象转换为一组字节写出。
 * 
 * java.io.OBjectInputStream
 * 对象输入流，可以读取一组字节将其还原为对象，前提是读取的这组字节应当是对
 * 象输出流将一个对象转换的字节。
 * 
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("张三");
		p.setGender("男");
		p.setAge(18);
		String [] otherInfo = {"是一个虚拟人物","常常被用来形容各个人性特点","与之相同的还有李四，王五"};
		p.setOtherInfo(otherInfo);
		System.out.println(p);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/* 将给定对象转换为一组字节后写出
		 * oos.writeObject方法在当前案例中经过了两个流，首先:
		 * oos:将给定的对象p转换为一组字节，这个过程陈为对象序列化。
		 * fos:oos将对象转换为字节后将这组字节交给fos写入文件，将数据写入文件等于写入到硬盘
		 * 作长久保存，这个过程称为数据持久化。
		 */
		oos.writeObject(p);
		System.out.println("写出完毕！");
		oos.close();
	}
}