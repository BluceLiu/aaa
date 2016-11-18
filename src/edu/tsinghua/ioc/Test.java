
package edu.tsinghua.ioc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CunChu cunChu=new CunChu();
		RuanPan ruanPan=new RuanPan();
		cunChu.save(ruanPan);
		
		Upan upan=new Upan();
		cunChu.save(upan);
		
		YingPan yingPan=new YingPan();
		cunChu.save(yingPan);
	}

}
