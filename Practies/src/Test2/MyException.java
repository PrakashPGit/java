package Test2;

public class MyException extends RuntimeException {

	public  MyException(String msg) {
		super(msg);
	}
	
	public void  finalize() {
		System.out.println("clean up");
	}
	
	public void Rada(int a , int b) throws ClassCastException
	{
		
		
		System.out.println(a/b +" hi");
	}
}
