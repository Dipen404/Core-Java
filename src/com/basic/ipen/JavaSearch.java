package com.basic.ipen;
import java.util.Scanner;

public class JavaSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array elements");
		int max = sc.nextInt();
		int arr[] = new int[max];
		System.out.println("Enter the array elements");

		for(int i = 0; i<max; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter any value to be searched");
		int key = sc.nextInt();
		int index =-1;
		for(int i = 0; i<max; i++)
		{
			if(arr[i]==key)
			{
				//System.out.println("Matching value "+arr[i]+" found on index "+i);
				index =i;
			}
			else
			{
				//System.out.println("No matching value of "+key+" found");
				index =-1;
			}
		}
		if(index==-1)
		{
			System.out.println("No matching found");
		}
		else
		{
			System.out.println("Matching value found at index "+index);
		}
	}

}
