package com.kodnest.PatternAssignments;

public class Pattern7 {
 public static void main(String [] args) {
	  for(int i=1;i<=11;i++) {
		  for(int j=1;j<=11;j++) {
		  if((i==1 && j==6)|| (i==2 && j==5) ||(i==2 && j==7)|| (i==3 && j==4) || (i==3 && j==8)
				  || (i==4 &&j==3)||(i==4 &&j==9) || (i==5 && j==2) || (i==5 && j==10) || (i==6 && j==1)
				  ||(i==6 && j==11) || (i==7 && j==2)||(i==7 && j==10)||(i==8 && j==3)||(i==8 && j==9)
				  || (i==9 && j==4)||(i==9 && j==8)||(i==10 && j==5)||(i==10 && j==7) || (i==11 && j==6)) {
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
