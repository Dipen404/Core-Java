package com.basic.ipen;
import java.util.Scanner;

public class JavaSort {

	public static void main(String[] args) {
		int arr[]= {5,7,3,9,45,43,67,344};
		System.out.println("The numbers in the array are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int temp =0;
		for(int i =0; i<arr.length;i++)
		{
			for(int j =1;j<(arr.length-1);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp =arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		System.out.println("The numbers in ascending order");
		for(int i =0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("The numbers in descending order");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("===============================");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int max =sc.nextInt();
		int arra[]= new int[max];
		System.out.println("Enter the array elements");
		for(int i =0;i<max;i++)
		{
			arra[i] = sc.nextInt();
		}
		System.out.println("The entered array elements");
		for(int i =0;i<max;i++)
		{
			System.out.println(arra[i]);
		}

	}

}
