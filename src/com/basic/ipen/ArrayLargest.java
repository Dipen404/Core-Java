package com.basic.ipen;
import java.util.Scanner;

public class ArrayLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int max = sc.nextInt();
		int arr[] =new int[max];
		System.out.println("Enter the array elements");
		for(int i =0; i<max;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int largest;
		for(int i = 0; i<max; i++)
		{
			for(int j=i+1;j<max;j++)
			if(arr[i]>arr[j])
			{
				largest = arr[i];
				arr[i]=arr[j];
				arr[j]=largest;
			}
			
		}
		System.out.println("The numbers in ascending order");
		for(int i = 0; i<max;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("The largest number is "+arr[max-1]);
		System.out.println("The second largest number is "+arr[max-2]);
		System.out.println("The smallest number is "+ arr[0]);

	}

}
