package Assignment.day2;

public class Checkpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=34343;
		int temp=0;
		int b=a;
		
		for(int i=0;i<=4;i++) {
			
			temp=(temp*10)+(a%10);
			a=a/10;
		}
		System.out.println(temp);
		
		if(b==temp)
		{
			System.out.println("its a palindrome number");
		}
		else {
			 
			System.out.println("its not a palindrome number");
		}
			
			
		
	}

}
