package com.danijel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class UniApp {
	public static void main (String[] args){
		
	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
	Person person = (Person) context.getBean("person");
	person.introduce();

	StudentList student = (StudentList) context.getBean("studentlist");
	System.out.println(student);

	Subject math = (Subject) context.getBean("math");
	System.out.println(math);
	Subject history = (Subject) context.getBean("history");
	System.out.println(history);
	Degree degree = (Degree)context.getBean("degree");
	System.out.println(degree);
	
	HomeworkWorker homeworkWorker = (HomeworkWorker) context.getBean("homeworkworker");
	homeworkWorker.DoHomeworkNow("done");
	homeworkWorker.DoHomework2Now("Homework2 done");


	((FileSystemXmlApplicationContext)context).close();
	}
}
