package Test2;

public class ReverseNO {
	public static void main(String[] args) {
		System.out.println("mb");
		int a = 20;
		int temp = a , reverse = 0 , sum = 0 , mul=1 , div;
		
		
		
		while(a!= 0){
			int d = a%10;
			//reverse = reverse * 10 + d;
			sum+=d;
			mul = mul * d;
			a/=10;
		}
		
	  System.out.println(reverse);
	  
	  int res = sum + mul;
	  
			  
	  if( res == temp) {
		  System.out.println(temp +" no is plaindrom");
	  }
	  
	  else {
		 //throw new MyException("invalid No");
		 
	  }
	try {
	  MyException myException = new MyException(null);
	  	myException.Rada(1,0);
	}
	
	catch(ArithmeticException r) {
		System.out.println("handaled");
	}
	
System.gc();
System.runFinalization();
	}

	}


