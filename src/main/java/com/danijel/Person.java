package com.danijel;

public class Person {
	private int jmbg;
	private String name;
	private int age;
	private Contact contact;
	public Person() {
	}
	public Person(int jmbg, String name) {
		this.jmbg = jmbg;
		this.name = name;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void introduce (){
		System.out.println("Hello, I am " + this.name + ", I am " + this.age + " years old.");
		System.out.println("This is my email: " + contact.getEmail() + ", and this is my Phone number: " + contact.getPhone() + " .");
	}
	@Override
	public String toString() {
		return "Person [jmbg=" + jmbg + ", name=" + name + ", age=" + age + ", contact=" + contact.toString() + "]\n";
	}
	
	public void onCreate(){
	System.out.println("Person created " + this);
	}
	public void onDestroy(){
	System.out.println("Person destroyed " + this);
	}
}

