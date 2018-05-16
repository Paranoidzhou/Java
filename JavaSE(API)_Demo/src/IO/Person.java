package IO;

import java.io.Serializable;
import java.util.Arrays;

/*
 * 使用该类测试对象流的对象读写操作。
 * 
 * 需要注意：若当前类的实例希望能被对象流读写，那么要求当前类必须实现java.io.Serializable接口
 */
public class Person implements Serializable {
	/**
	 * 当一个类实现了Serializable接口后，应当定义一个常量：serialVersionUID.
	 *    序列化版本号影响反序列化时是否成功，当对象输入流在进行反序列化时会对比该对象与
	 * 当前对象类的版本号是否一致，一致则反序列化成功，不一致则会报错，抛出异常：InvalidClassException。
	 *    若我们没有指定版本号，编译器会在编译时按照当前类的结构生成一个，但是这样做会导致当前类
	 * 发生改变，那么版本号一定会变，这样就无法控制反序列化规则。
	 */
	private static final long serialVersionUID = 1L;    //定义版本号 
	private String name;
	private String gender;
	private int age;
	/*
	 * 当一个属性被transient修饰后，这个对象在序列化时该属性的值会被忽略。
	 * 忽略不必要的属性可以达到对象序列化“瘦身”的功能。
	 */
	private transient String [] otherInfo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String toString(){
		return name + "," + age + "," + gender + ","+Arrays.toString(otherInfo);
	}
}
