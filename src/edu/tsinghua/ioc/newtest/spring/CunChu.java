package edu.tsinghua.ioc.newtest.spring;

public class CunChu {
	
	Pan pan;
	public void save(){
		pan.save();
	}
	public Pan getPan() {
		return pan;
	}
	public void setPan(Pan pan) {
		this.pan = pan;
	}

	
}
