package com.basic.ipen;

public class JavaLoops {

	public static void main(String[] args) {
		for(int i =1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("==============");
		
		for(int i =5; i>=1; i--)
		{
			for(int j =1;j <=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		int arr[]={1,6,8,34,2,2,54};
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		for(int i =0; i<=10;i++)
		{
			if(i==6)
			{
				break;
			}
			System.out.println(i);
		}
	}

}
