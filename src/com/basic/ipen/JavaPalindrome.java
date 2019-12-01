package com.basic.ipen;
import java.util.Scanner;

public class JavaPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int num1=num;
		int revnum=0;
		int length = String.valueOf(num).length();
		//System.out.println("total length is "+ length);
		do{
		int digit =num%10;
		revnum+=(int) (digit*Math.pow(10, length-1));
		length--;
		num=num/10;
		if(length==1)
		{
			revnum=revnum+num;
		}
		//System.out.println("seperated num is "+num+" and seperated digit is "+digit);
		//System.out.println("The sum is "+revnum);
		}
		while(num/10!=0);
		//System.out.println("The reverse number of "+num1+" is "+revnum);
		if(num1==revnum)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
		
		System.out.println("Enter another number");
		int n=sc.nextInt();
		int r,sum=0,temp;    
		  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;  
		   System.out.println("The sum is "+sum);
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}

}
