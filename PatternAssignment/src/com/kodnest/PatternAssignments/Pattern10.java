package com.kodnest.PatternAssignments;

public class Pattern10 {
	public static void main(String [] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if( (j==1)||(i==1)||(i==3)||(j==6)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}


