package exception;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 子类重写父类含有throws声明异常抛出的方法时
 * 对throws的重写原则
 * @author adminitartor
 *
 */
public class ThrowsDemo {
	public void dosome()
		throws IOException,AWTException{
		
	}
}

class Son extends ThrowsDemo{
//	public void dosome()
//		throws IOException,AWTException{
//			
//	}
	
	//可以不再抛出任何异常
//	public void dosome(){
//			
//	}
	
	//可以仅抛出部分异常
//	public void dosome()
//			throws IOException{
//			
//	}
	
	//可以抛出父类方法中抛出异常的子类型异常
//	public void dosome()
//			throws FileNotFoundException{
//			
//	}
	
	//不允许抛出额外异常
//	public void dosome()
//			throws SQLException{
//			
//	}
	
	//不可以抛出父类方法抛出异常的父类型异常
//	public void dosome()
//			throws Exception{
//			
//	}
}






