package com.app.utility;

import java.util.ArrayList;
import java.util.List;

import com.app.model.Student;

public class StudentUtility {
	
	public static List<Student> getStudentsList()
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Rahul","Pawar","rahul@gmail.com"));
		list.add(new Student("Sayalee","Patil","sayalee@gmail.com"));
		list.add(new Student("Viraj","Shah","Viraj@gmail.com"));
		list.add(new Student("Sham","C","sham@gmail.com"));
		list.add(new Student("Kaushik","S","kaushik@gmail.com"));
		list.add(new Student("Zaid","A","Zaid@gmail.com"));
		
		return list;
		
	}

}
