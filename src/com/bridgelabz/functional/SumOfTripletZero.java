package com.bridgelabz.functional;

public class SumOfTripletZero {
	
	public static void  findTriplets(int[]a,int n) {
		
		boolean found=true;
		
		for(int i=0;i<n-2;i++) 
		{
			for(int j=i+1;j<n-1;j++) 
			{
				for(int k=j+1;i<n;i++) 
				{
					if(a[i]+a[j]+a[k]==0) 
					{
						System.out.print(a[i]);
						System.out.print(" ");
						System.out.print(a[j]);
						System.out.print(" ");
						System.out.print(a[k]);
						System.out.print(" ");
						found=true;
						break;
					}
				System.out.println();
				}
			}
		}
		if(found==false) 
			System.out.println("Does not exist");
	}
	
	
	public static void main(String[] args) {
		int[] a= {2,1,-3,7,-4,5,4};
		int n=a.length;
		//System.out.println(a.length);
		findTriplets(a, n);
	}
}
