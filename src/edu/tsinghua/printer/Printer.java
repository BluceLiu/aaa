package edu.tsinghua.printer;

public class Printer {

	Ink ink;
	Paper paper;
	public void print(){
		System.out.println("��ӡ������"+paper.getSize()+"ֽ���ϣ���ӡ"+ink.getColor()+"��ɫ");
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
