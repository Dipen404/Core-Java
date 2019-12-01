package com.basic.ipen;
import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row of first matrix");
		int firstRow = sc.nextInt();
		System.out.println("Enter the column of first matrix");
		int firstCol = sc.nextInt();
		System.out.println("Enter the row of second matrix");
		int secondRow = sc.nextInt();
		System.out.println("Enter the column of second matrix");
		int secondCol = sc.nextInt();
		
		int finalMat[][]= new int[firstRow][firstCol];
		int firstMat[][]= new int[firstRow][firstCol];
		System.out.println("Enter the elements of first matrix");
		for(int i = 0;i<firstRow;i++)
		{
			for(int j = 0;j<firstCol; j++)
			{
				firstMat[i][j]= sc.nextInt();
			}
		}
		
		int secondMat[][]= new int[secondRow][secondCol];
		System.out.println("Enter the elements of second matrix");
		for(int i = 0;i<secondRow;i++)
		{
			for(int j = 0;j<secondCol; j++)
			{
				secondMat[i][j]= sc.nextInt();
			}
		}
		if((firstRow==secondRow)&&(secondCol==firstCol))
		{
			System.out.println("The matrix can be added");
			for(int i = 0; i<firstRow;i++)
			{
				for(int j = 0; j<firstCol; j++)
				{
					finalMat[i][j]=firstMat[i][j]+secondMat[i][j];
				}
			}
		}

		else
		{
			System.out.println("The matrix size does not match each other for addition");
		}
		
		System.out.println("The final added matrix is:");
		for(int i = 0;i<firstRow;i++)
		{
			for(int j = 0;j<firstCol;j++)
			{
				System.out.print(finalMat[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
