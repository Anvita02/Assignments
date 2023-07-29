package com.kodnest.PatternAssignments;

public class Pattern23 {
	public static void main(String [] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=5;j++) {
				if((i==1 && j!=1) || (j==1 && i!=1 && i!=5 && i!=6 && i!=7&& i!=8  )|| (i==5 && j!=1 && j!=5) || 
						(j==5 && i!=2 && i!=3&& i!=4&& i!=9 && i!=5) ||(i==9 && j!=5)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
