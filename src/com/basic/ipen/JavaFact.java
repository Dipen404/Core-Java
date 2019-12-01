package com.basic.ipen;
import java.util.Scanner;

public class JavaFact {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		int num =sc.nextInt();
		int loop=num;
		int fact=1;
		
		for(int i =loop;i>1;i--)
		{
			fact*=num*(num-1);
			num--;
			//System.out.println("The factorial of "+loop+" is "+fact);
		}
		System.out.println("The factorial of "+loop+" is "+fact);

		System.out.println("Enter another number to find factorail");
	}

}
