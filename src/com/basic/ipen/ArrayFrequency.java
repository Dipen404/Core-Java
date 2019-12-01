package com.basic.ipen;
import java.util.Scanner;

public class ArrayFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array elements");
		int max = sc.nextInt();
		int arr[]= new int[max];
		System.out.println("Enter the array numbers");
		
		for(int i = 0; i< max; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int count[] = new int[max];
		
		
		for(int i = 0; i <max; i++)
		{
			for (int j= i+1; j<max; j++)
			{
				if(arr[i]==arr[j])
				{
					count[i]++;
				}
			}
		}
		System.out.println("The frequency of count are:");
		for(int i =0;i<max; i++)
		{
			System.out.println(count[i]);
		}

		System.out.println("To display the duplicate array elements");
		for(int i = 0 ; i<max; i++)
		{
			for(int j =i+1;j<max;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

}
