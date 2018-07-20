package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * 对象流是一对高级流,可以方便我们将java中任何对象
 * 进行读写操作.
 * 
 * java.io.ObjectOutputStream
 * 对象输出流,可以将对象转换为一组字节写出
 * 
 * java.io.ObjectInputStream
 * 对象输入流,可以读取一组字节将其还原为对象,前提
 * 是读取的这组字节应当是对象输出流将一个对象转换
 * 的字节.
 * 
 * @author adminitartor
 *
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("苍老师");
		p.setGender("女");
		p.setAge(18);
		String[] otherInfo = {"是一名演员","爱好是写毛笔字","已婚","促进中日文化交流","广大男性同胞的启蒙老师"};
		p.setOtherInfo(otherInfo);
		System.out.println(p);
		
		
		FileOutputStream fos
			= new FileOutputStream("person.obj");
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		/*
		 * 将给定对象转换为一组字节后写出
		 * oos.writeObject方法在当前案例中
		 * 经过了两个流,首先:
		 * oos:将给定的对象p转换为了一组字节,这个
		 *     过程称为对象序列化
		 * fos:oos将对象转换为字节后将这组字节交
		 *     给fos写入文件,将数据写入文件等于写
		 *     如到硬盘中作长久保存,这个过程称为
		 *     数据持久化.    
		 */
		oos.writeObject(p);
		
		System.out.println("写出完毕!");
		oos.close();
	}
}









