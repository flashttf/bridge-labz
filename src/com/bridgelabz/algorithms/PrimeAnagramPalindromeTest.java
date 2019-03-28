package com.bridgelabz.algorithms;

import java.util.*;
public class PrimeAnagramPalindromeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range from 2 to n");
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		System.out.println("Numbers that are prime and palindrome are as follows:\n");
			for(int i=2;i<=n;i++) {
				if(Utility.checkPrime(i)) {
									al.add(i);						
					int reverseNum=Utility.toReverseNum(i);
						if(Utility.checkPrime(reverseNum)) {
							if(i==reverseNum) {
									System.out.println(i);
							}
						}
					}
				}
			System.out.println();
			System.out.println("Printing all prime numbers in range \n"+al);
			System.out.println();
		/*	
			int[] arr=new int[al.size()];
			Iterator<Integer> itr=al.iterator();
			for(int i=0;i<al.size();i++){
				arr[i]=itr.next().intValue();
			}
			
			for(int k=0;k<arr.length;k++){
				int new1=k;
				for(int m=k+1;m<arr.length;m++){
					int new2=m;
					if(Utility.checkAnagram(Integer.toString(new1), Integer.toString(new2))) {
						System.out.println(new1+" "+new2);
					}
				}
			}
			
			
	*/
			try {
				
				
				
				for(int j=0;j<al.size();j++) {
					for(int k=j+1;k<al.size();k++) {
						if(Utility.checkAnagram(Integer.toString(al.get(j)), Integer.toString(al.get(k)))) {
							System.out.println(al.get(j)+" "+al.get(k));
						}
					}
				}
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
	}
}


