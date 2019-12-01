package com.basic.ipen;
import java.util.Scanner;

public class JavaPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		String output =(count==0)?"prime":"not prime";
		System.out.println(output);
		/*if(count==0)
		{
			System.out.println("prime");
		}

		else
		{
			System.out.println("not prime");
		}*/
	}

}
