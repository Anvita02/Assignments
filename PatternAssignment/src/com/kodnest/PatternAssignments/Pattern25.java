package com.kodnest.PatternAssignments;
import java.util.Scanner;
public class Pattern25 {
 public static void main(String [] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the value of n");
	 int n=scan.nextInt();
	 for(int i=1;i<=7;i++) {
		 for(int j=1;j<=n;j++) {
				 if((j==1)||(i+j==6)||(i-j==2)) {
					 System.out.print("# ");
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
		 System.out.print("  ");
		
	 //logic for o
		 for(int j=1;j<=n;j++) {
			 if((j==1 && i!=1 && i!=7) || (j==5 && i!=1 && i!=7) || (i==1 && j!=1 && j!=5 &&  j!=6 && j!=7) 
					 || (i==7 & j!=1 && j!=5 && j!=6 && j!=7)) {
				 System.out.print("# ");
			 }
			 else {
				 System.out.print("  ");
			 }
		 }
		 System.out.print("  ");
		 
		 
		 
	//logic for D
		 for(int j=1;j<=n;j++) {
				if((j==1)|| (i==1 && j!=6)||(j==6 && i!=1 && i!=7)|| (i==7 && j!=6)) {
					System.out.print("#"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
		 System.out.print("  ");
		 
		 
	 //logic for N
	 for(int j=1;j<=n;j++) {
		 if((j==1) || (j==6) ||(i==j)) {
			 System.out.print("# ");
		 }
		 else {
			 System.out.print("  ");
		 }
	 }
	 System.out.print("  ");
	 
	 
	 //logic for E
	 for(int j=1;j<=n;j++) {
		 if((j==1)||(i==1)||(i==4)||(i==7))	{
			 System.out.print("# ");
		 }
		 else {
			 System.out.print("  ");
		 }
	 }
	 System.out.print("  ");
	 
	 // logic for S
	 for(int j=1;j<=n;j++) {
		 if((i==1 && j!=6) ||(j==1 && i!=5 && i!=6 ) || (i==4 && j!=6) ||
				 (j==5&& i!=2 && i!=3)|| (i==7 && j!=6)) {
				
					 System.out.print("# ");
				 }
				 else {
					 System.out.print("  ");
				 }
		 }
	 
	 // logic for T
	
	 for(int j=1;j<=n;j++) {
		 if((i==1 || j==4)) {
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


