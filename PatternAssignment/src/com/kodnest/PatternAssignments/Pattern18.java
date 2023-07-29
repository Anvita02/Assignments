package com.kodnest.PatternAssignments;

public class Pattern18 {
 public static void main(String [] args) {
	 for(int i=1;i<=8;i++) {
		 for(int j=1;j<=8;j++) {
			 if((i==1) || (i==8) || (i==j) ||(i+j==9)) {
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
