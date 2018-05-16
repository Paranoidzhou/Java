package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
/*
 * 子类重写父类含有throws声明异常抛出的方法时对throws的重写原则。
 * 【两同两小一大原则】
 */
public class ThrowsDemo {
	public void dosome() throws IOException,AWTException{
	}
}

class Son extends ThrowsDemo{
	/* 此异常允许抛出，因为和父类抛出异常相等*/
	//	public void dosome() throws IOException,AWTException{
	//	}

	/*不抛出任何异常，也是允许的*/
	//	public void dosome(){
	//	}

	/*可以抛出部分异常,也是允许的*/
	//	public void dosome() throws IOException{
	//	}
	
	/*可以抛出父类方法中抛出异常的子类型异常*/
	//	public void dosome() throws FileNotFoundException{
	//	}

	/** 以下异常抛出都为错误的（编译不通过）*/
	/*子类抛出父类的父类型异常*/
	//	public void dosome() throws Exception{
	//	}

	/*不可以抛出额外异常*/
	//	public void dosome() throws SQLException{
	//    }
}