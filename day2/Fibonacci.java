package Assignment.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int range=8;
		int firstNum=0;
		int secNum=1;
		int sum;
		System.out.println("fibonacco series");
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=0;i<=range;i++) {
			sum=secNum+firstNum;
			System.out.println(sum);
			firstNum=secNum;
			secNum=sum;
			
			
		}
		
		
		
		
		
	}

}
