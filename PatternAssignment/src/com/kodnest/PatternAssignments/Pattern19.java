package com.kodnest.PatternAssignments;

public class Pattern19 {
 public static void main(String [] args) {
	 for(int i=1;i<=8;i++) {
		 for(int j=1;j<=7;j++) {
			 if((j==1 && i!=1 && i<6) || (i==1 && j!=1 && j!=4 && j!=7) || (j==4 && i==2) || (j==7 && 
					 i!=1 && i<6) ||(i+j==12) ||(i-j==4)) {
				 System.out.print("# ");
			 }
			 else {
				 System.out.print("  ");
			 }
		 }
		 System.out.println();
	 }
 }
}
