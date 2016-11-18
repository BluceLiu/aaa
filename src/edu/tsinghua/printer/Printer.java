package edu.tsinghua.printer;

public class Printer {

	Ink ink;
	Paper paper;
	public void print(){
		System.out.println("打印机正在"+paper.getSize()+"纸张上，打印"+ink.getColor()+"颜色");
	}
	public Ink getInk() {
		return ink;
	}
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
}
