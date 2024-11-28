// 2d array 
/* 2d array write a program to take input 2d array from the usr and print it on screen in matrix form */

import java.util.Scanner;

class Ad4{
      public static void main(String args[]){
      int A[][]=new int[2][5];
       
      
      int r,c;
      Scanner sk=new Scanner(System.in);
     for(r=0;r<A.length;r++){
         for(c=0;c<A[r].length;c++){
      
      System.out.println("Enter array index of "+r+c+ ": ");
      A[r][c]=sk.nextInt();
     }
    }
         System.out.println(" output of 2D array :");
      for(r=0;r<A.length;r++){
         for(c=0;c<A[r].length;c++){
      
      System.out.print(" " +A[r][c]);
      
     }
     System.out.println(" ");
    }


}
}


