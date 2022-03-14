package com.capg.Java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
public static void main(String[] args) {
	//Student obj = new Student();
			//obj.setStid(100);
			//obj.setStname("rama");
			
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			
			//Student stu = (Student)context.getBean("stu");
			Student stu = context.getBean(Student.class);

//			stu.setStid(101);
//			stu.setStname("Maven Spring Project");
//			
//			System.out.println(stu.getStid());;
//			System.out.println(stu.getStname());
		stu.displayStudentInfo();
			
			
}
}
