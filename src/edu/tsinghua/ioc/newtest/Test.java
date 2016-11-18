
package edu.tsinghua.ioc.newtest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CunChu cunChu=new CunChu();
//		Pan pan=new YingPan();
//		Pan pan=new Upan();
		Pan pan=new RuanPan();
		cunChu.save(pan);
	}

}
