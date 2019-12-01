package com.basic.ipen;
import java.util.Scanner;

public class JavaOddAndEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int max = sc.nextInt();
		int arr[]= new int[max];
		System.out.println("Enter the array elements");
		for(int i = 0; i<max;i++)
		{
			arr[i]= sc.nextInt();
		}
		int evenTotal =0;
		System.out.println("Even numbers:");
		for(int i =0;i<max;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				evenTotal++;
			}
		}
		
		System.out.println("Odd numbers:");
		for(int i =0;i<max;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
		if(evenTotal>0)
		{
			System.out.println("There are "+evenTotal+" even numbers");
		}
		else
		{
			System.out.println("There are no even numbers");
		}
		

	}

}
