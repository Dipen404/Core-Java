package com.basic.ipen;
import java.util.Scanner;

public class DayOne {
	
	 static void checkNum(int number){
		 if(number%2==0)
			{
				System.out.println("The entered number is even");
			}
			else
			{
			System.out.println("The entered number is odd");
			}
	}

	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter any number to check");
		//int number = sc.nextInt();
		//DayOne.checkNum(number);
		int full=800;
		System.out.println("Enter yours obtained total marks");
		int num =sc.nextInt();
		int percent = (num*100)/full;
		
		checkGrade(percent);
	}

	private static void checkGrade(int percent) {
		if(percent>=90)
		{
			System.out.println("Congratulations you got Grade A+ and your percent is "+percent);
		}
		else if(percent<90 && percent >=80)
		{
			System.out.println("Congratulations you have got Grade A and your percent is "+percent);
		}
		else if(percent<80 && percent >=70)
		{
			System.out.println("Congratulation you have fot Grade B+ and your percent is "+percent);
			
		}
		else if(percent<70 && percent >=60)
		{
			System.out.println("Congratulations you have got Grade B and your percent is "+percent);
		}
		else if(percent<60 && percent >=50)
		{
			System.out.println("Congratulations you have got Grade C and your percent is "+percent);
		}
		else
		{
			System.out.println("Sorry you have failed and your percent is "+percent);
		}
		
	}

}
