package com.danijel;

import java.util.List;


public class StudentList {
	private String name;
	private List<String> students;

	public StudentList(String name, List<String> students) {
		this.name = name;
		this.students = students;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append(name);
		sb.append(":\n");
		for (String student: students){
			sb.append(student);
			sb.append("\n");
		}
		return sb.toString();
	}
}
