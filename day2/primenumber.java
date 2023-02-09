package Assignment.day2;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=13;
		boolean isPrime=false;
		for (int i=2; i<=num%2;i++) {
		    if (num%i==0) {
		    	 isPrime=true;
		    	 break;
		    	 
		    }
		}
		
		if(isPrime==false) {
			
			System.out.println(" it is a prime number");
			
		}
		else {
			
			System.out.println("it is not a prime number");
		}
		
		
		
		
	}

}
