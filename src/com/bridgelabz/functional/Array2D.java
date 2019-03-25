package com.bridgelabz.functional;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D {
		
		public static void create2DArray(int[][] a,int n,int m) {
			Scanner sc=new Scanner(System.in);
			PrintWriter pw=new PrintWriter(System.out);
			System.out.println("Enter elements of array");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("2d arrays is as shown:\n");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					pw.print(a[i][j]+" ");
					pw.flush();
				}System.out.println();
				
			}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and columns of array");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] a=new int[m][n];
		create2DArray(a, n, m);
		
	}
}
