package Assignment.day2;

import java.util.Arrays;

public class Arraysmallestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {23,45,67,32,89,22};
		
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Second smallest number is : "+ arr[1]);
		
		
		
	}

}
