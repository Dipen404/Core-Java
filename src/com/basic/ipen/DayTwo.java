package com.basic.ipen;
import java.util.Scanner;

public class DayTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check even or odd");
		int num = sc.nextInt();
		 
		String output = (num%2==0)? "Even number":"Odd number";
		System.out.println("The inputted number is "+ output);
		IfElse obj= new IfElse();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your weight");
		int weight = sc.nextInt();
		String check= obj.checkBlood(age, weight);
		System.out.println(check);
	}

	

}
 class IfElse
{
	String checkBlood(int age, int weight)
	{
		if(age>18)
		{
			if(weight>50)
			{
				return "You are eligible";
			}
			else
			{
				return "You are not eligible";
			}
		}
		else
		{
			return "You are not eligible";
		}
	}
}
