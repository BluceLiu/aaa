package edu.tsinghua.spring;

public class HelloSpring {
	String message="spring DI!";
	public void say(){
		System.out.println("Hello,"+this.message);
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
}
