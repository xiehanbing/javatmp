package singleProject;
import service.*;
import sun.management.counter.Variability;

public class temp1 {

	/*接口定义*/
	public static ITmpService _tmpService=new TmpService();
	public static void main(String[] args) {
		pri();
		// TODO Auto-generated method stub
//System.out.println("hello world");
//System.out.println("nice boy");
//String mString=_tmpService.message();
//System.out.println(mString);
//System.out.println(_tmpService.isSuccess(true));
	}

	private static void pri() {
		// TODO Auto-generated method stub

		System.out.println("基本类型：byte 二进制位数:"+Byte.SIZE);
		final double PI=3.1415927;
		int hexa=0111;
		System.out.println(hexa);
		
	}
}
