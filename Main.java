package Test2;

/*
This program i try to find no is palendrom or not 
1. if no is palendron it will show message 
2. if no is not palendrom then it will show custome exceptiom

also i create divison method for arithmatic exception

*/



public class Main {
	public static void main(String[] args) {
		
		int a = 19;
		int temp = a , sum = 0 , mul=1 ;
				
		while(a!= 0){
			int d = a%10;
			
			sum+=d;
			mul = mul * d;
			a/=10;
		}
	  int res = sum + mul;		  
	  if( res == temp) {
		  System.out.println(temp +" no is palindrom");
	  }
	  else {
		 throw new MyException("No Is Not Palindrom");
	  }
	  
	  
	  //here i call Division Method and 
	  //create exception for divide by zero operation 
	  
	try {
	  MyException myException = new MyException(null);
	  	myException.Division(60,6);
	}
	
	catch(ArithmeticException r) {
		System.out.println("handaled");
	}
	
	}

	}


