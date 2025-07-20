package package1;

import java.util.Scanner;

public class MatrixOperation {
	public static void main(String[] args) {

		int row,col;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows :");
		row = sc.nextInt();
		System.out.print("Enter no. of cols :");
		col = sc.nextInt();

		int [][] mat1=new int[row][col];
		int [][] mat2=new int[row][col];
		int [][] mat3=new int[row][col];

		//Accept mat1
		System.out.println("\nEnter matrix1 ele ::");
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				System.out.print("Enter ele :");
				mat1[r][c]=sc.nextInt();
			}
		}

		//Accept mat2
		System.out.println("\nEnter matrix2 ele ::");
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				System.out.print("Enter ele :");
				mat2[r][c]=sc.nextInt();
			}
		}

		sc.nextLine();
		//display mat1
		System.out.println("\nMatrix1 ele :");
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				System.out.print(mat1[r][c]+" ");

			}
			System.out.println();
		}

		//display mat2
		System.out.println("Matrix2 ele :");
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				System.out.print(mat2[r][c]+" ");

			}
			System.out.println();
		}

		//mat3 
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				mat3[r][c]=mat1[r][c]+mat2[r][c];
			}
		}

		sc.nextLine();
		//Display mat3
		System.out.println("Matrix3 ele :");
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				System.out.print(mat3[r][c]+" ");

			}
			System.out.println();
		}

	}

}
