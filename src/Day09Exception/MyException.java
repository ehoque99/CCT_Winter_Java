package Day09Exception;

public class MyException {
	
	
String a;
	
	public MyException(String b) {
		a=b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Exception Ocuurs");
		
		try {	
		int i = 0, k=300;
		int j=k/i;
			
		    } 
		
		catch(Exception e) {

						System.out.println("Exception is Handled");

			}
		
		System.out.println("Result");

	}
  
  
  
}
