package Test2;

public class MyException extends RuntimeException {

	// Custom Exception 
	public  MyException(String msg) {
		super(msg);
	}
	
	@Override
	public void  finalize() {
		System.out.println("clean up");
	}
	
	// Create Method which has Perform DIvision
	public void Division(int a , int b) throws ArithmeticException
	{
		System.out.println(a/b +" Divison");
	}
}
