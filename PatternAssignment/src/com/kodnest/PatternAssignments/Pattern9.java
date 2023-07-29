/*
 *      1
 *     1 1
 *    1 2 1
 *   1 3 3 1 
 *   
 *   
 * 
 */

package com.kodnest.PatternAssignments;

public class Pattern9 {
 public static void main(String [] args) {
	 for(int i=1;i<=4;i++) {
		 for(int j=4;j>=i;j--) {
			 System.out.print(" ");
		 }
		 int count=1;
		 for(int j=1;j<=i;j++) { 
			 System.out.print(count+" ");
			 count=count*(i-j)/j;
		 }
		 System.out.println();
	}
 }
}
