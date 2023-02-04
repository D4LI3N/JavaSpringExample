package com.danijel;

import java.util.List;

public class Degree {
	private Subject optional;
	private List<Subject> subjects;
	
	public Subject getOptional() {
		return optional;
	}
	public void setOptional(Subject largest) {
		this.optional = largest;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("\nOptional: " + optional);
		sb.append("\n\n");
		sb.append("All subjects: \n");
		for (Subject subject: subjects){
			sb.append(subject);
			sb.append("\n");
		}
		return sb.toString();
	}
}

