package singleProject;
import service.*;
import sun.management.counter.Variability;

public class temp1 {

	public static ITmpService _tmpService=new TmpService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello world");
System.out.println("nice boy");
String mString=_tmpService.message();
System.out.println(mString);
System.out.println(_tmpService.isSuccess(true));
	}

}
