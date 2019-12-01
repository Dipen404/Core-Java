package com.basic.ipen;
import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int max = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[max];
		for(int i = 0; i<max; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int arrCopy[] = new int[max];

		for(int i =0;i<max; i++)
		{
			arrCopy[i]=arr[i];
		}
		System.out.println("Showing new array elements");
		
		for(int i = 0; i<max; i++)
		{
			System.out.println(arrCopy[i]);
		}
	}

}
