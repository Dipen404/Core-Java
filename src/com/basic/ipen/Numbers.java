package com.basic.ipen;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int max = sc.nextInt();
		int arr[]= new int[max];
		System.out.println("Enter the numbers");
		
		for(int i =0; i<max; i++)
		{
			arr[i]=sc.nextInt() ;
		}
		System.out.println("The entered numbers are:");
		for(int i = 0; i<max; i++)
		{
			System.out.println(arr[i]);
		}
		int temp = 0;
		
		for(int i = 0; i<max; i++)
		{
			for(int j=i+1;j<max;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("The numbers in ascending order are:");
		for(int i =0;i<max;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
