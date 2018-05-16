package xml;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ParseXmlDemo {
	public static  void main(String[] args) {
		/*
		 *    将emplist.xml文件中保存的员工信息解析出来，以若干Emp
		 * 实例形式存入List集合。
		 *     
		 *    程序中的数据不应在程序中写死，否则一旦数据有修改，就要
		 * 修改源程序。这是在实际开发中不推荐的.   
		 */
		List<Emp> list = new ArrayList<Emp>();
		try {
			/*
			 * 使用DOM4J解析XML的大致步骤：
			 * 1：创建SAXReader
			 * 2：使用SAXReader读取xml文档并得到对应的Document对象
			 * 3：通过Document获取根元素
			 * 4：从根元素中按照文档结构逐级读取子元素，以达到遍历XML
			 * 文档数据的目的.
			 */
			// 1
			SAXReader reader = new SAXReader();

			//2
			Document doc = reader.read(new File("emplist.xml"));
			//reader.read(new FileInputStream("emplist.xml"));

			/*
			 * Element的每一个实例用于表示xml文档中的一个元素（一对标签.）
			 * 其提供了很多获取其表示的元素相关信息的方法：
			 * String getName()
			 * 获取当前元素的名字(标签的名字)
			 * 
			 * String getText()
			 * 获取当前元素中间的文本(开始和结束标签中间的文本信息)
			 * 
			 * String elementText(String name)
			 * 获取当前元素中指定名字的子元素中间的文本.
			 * 例如：
			 * Strin str = e.elementText("name");
			 * 等同于：
			 * String str = e.element("name").getText();
			 * 
			 * Element element(String name)
			 * 获取当前元素中指定名字的子元素
			 * 
			 * List elements()
			 * 获取当前元素中所有子元素
			 * 
			 * List elements(String name)
			 * 获取当前元素中所有的指定名字的同名子元素
			 * 
			 * 
			 */
			//3
			Element root =doc.getRootElement();
			//System.out.println(root.getName());

			/* 获取根标签下所有<emp>标签*/
			List<Element>empList = root.elements("emp");


			/* 将每个<emp>标签表示的员工信息解析出来以Emp实例形式存入list集合. */
			for (Element empEle : empList) {

				Element nameEle = empEle.element("name");    //获取员工名字 ： 1、获取<name>标签
				String name = nameEle.getText();             //2、获取中间的文本数据
				System.out.println(name);

				//另一种写法：
				int age = Integer.parseInt(empEle.element("age").getTextTrim());
				System.out.println(age);

				//最简便写法：
				String named = empEle.elementText("named"); 
				System.out.println(named);

				int salary = Integer.parseInt(empEle.elementText("salary"));
				System.out.println(salary);

				//获取ID：
				Attribute att = empEle.attribute("id");
				//				int id = Integer.parseInt(att.getValue());
				//				System.out.println(id);

				int id = Integer.parseInt(empEle.attributeValue("id"));
				System.out.println(id);

				Emp emp = new Emp(id,name,age,named,salary);
				list.add(emp);
				System.out.println("解析完毕！！！！！！");
				for (Emp e : list) {
					System.out.println(e);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
