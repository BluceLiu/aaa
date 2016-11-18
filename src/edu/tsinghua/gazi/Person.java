package edu.tsinghua.gazi;

public class Person {
	private String name;
	private String context;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	public void say(){
		System.out.println(this.getName()+"หตฃบ"+this.getContext());
	}
	public Person(String name, String context) {
		super();
		this.name = name;
		this.context = context;
	}
	public Person() {
		super();
	}

}
