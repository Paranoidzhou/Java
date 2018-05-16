package xml;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/*
 * 写出xml文档： 
 */
public class WriteXmlDemo {
	public static void main(String[] args) {
		List<Emp>list=new ArrayList<Emp>();
		list.add(new Emp(1,"唐一",21,"男",5000));
		list.add(new Emp(2,"牛二",22,"男",6000));
		list.add(new Emp(3,"张三",23,"男",7000));
		list.add(new Emp(4,"李四",24,"男",8000));
		list.add(new Emp(5,"王五",25,"男",9000));
		for (Emp emp : list) {
			System.out.println(emp);
		}
		try {
			/*
			 * 写出XML的大致步骤： 
			 * 1：创建一个Document对象表示一个空白文档.
			 * 2：向Document中添加根元素.
			 * 3：从根元素开始按照要生成的文档结构逐级添加子元素及信息.
			 * 4：创建XmlWriter.
			 * 5：将Document通过XmlWriter写出以生成XML文档.
			 */
			
			//第一步： 创建一个空白文档
			Document doc = DocumentHelper.createDocument();
			
			//第二步：添加根元素
			/*Document提供了添加根元素的方法：
			 *Element addElement(String name)
			 *   向当前文档中添加给定名字的根元素，并以Element实例的形式返回，以便于继续向
			 *根元素追加信息。需要注意：该方法只能调用一次，因为一个文档只能有一个根元素.
			 */
			Element root = doc.addElement("list");
			
			/* 将每个员工信息以<emp>标签形式存入到根元素中
			 *Element addElement(String name) 
			 *向当前元素中追加子元素并将其返回，以便继续对其追加.
			 *
			 *Element addText(String text)
			 *   向当前元素的开始与结束标签之间添加文本，返回的仍然是当前元素，以便对当前元素继
			 *续做其他追加操作,
			 *
			 *Element addAttribute(String name,String balue)
			 *向当前元素中追加指定名字与对应的属性，返回值仍然是当前元素.
			 */
			
			 //第三步：从根元素开始按照要生成的文档结构逐级添加子元素及信息
			 for (Emp e : list) {
				 Element empEle = root.addElement("emp");      //向根元素中追加子元素<emp>
				 Element nameEle = empEle.addElement("name");  //向<emp>中追加子元素<name>
				 nameEle.addText(e.getName());					  //向<name>标签中间添加文本
				 
				 Element ageEle = empEle.addElement("age");		//向<emp>中追加子元素<age>
				 ageEle.addText(e.getAge()+"");						//向<age>标签中间添加文本
				 
				 Element genderEle = empEle.addElement("gender");//向<emp>中追加子元素<gender>
				 genderEle.addText(e.getGender());					 //向<gender>标签中间添加文本
				 
				 Element salaryEle = empEle.addElement("salary");//向<emp>中追加子元素<salary>
				 salaryEle.addText(e.getSalary()+"");				 //向<salary>标签中间添加文本
				 
				 empEle.addAttribute("id",String.valueOf(e.getId()));//向<emp>中追加id属性
			}
			 //导包org.dom4j.io.XMLWriter
			 XMLWriter writer = new XMLWriter(
					 new FileOutputStream("myemp.xml"),    //第四步：创建XmlWriter.
					 OutputFormat.createPrettyPrint()   //此项可有可无，创建漂亮的格式.(给人看的时候添加)
					 );
			 writer.write(doc);                //第五步：将Document通过XmlWriter写出以生成XML文档.
			 System.out.println("写出完毕！！！");
			
			 writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
}
