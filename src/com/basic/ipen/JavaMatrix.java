package com.basic.ipen;
import java.util.Scanner;

public class JavaMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of row matrix");
		int row = sc.nextInt();
		System.out.println("Enter the size of column matrix");
		int column = sc.nextInt();
		int matrix[][] =new int[row][column];
		System.out.println("Enter the elements of matrix");
		for(int i =0;i<row;i++)
		{
			for(int j=0;j<column; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Displaying the matrix");
		for(int i =0;i<row;i++)
		{
			for(int j = 0; j<column;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
