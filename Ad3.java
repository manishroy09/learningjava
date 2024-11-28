/* 2d array write a program to take input 2d array from the usr and print it on screen in matrix form */

import java.util.Scanner;

class Ad3{
      public static void main(String args[]){
      int A[][]=new int[2][5];

      Scanner k=new Scanner(System.in);
      
     
      
   
     System.out.println("Enter Element Index 00 : ");
     A[0][0]=k.nextInt();
     System.out.println("Enter Element Index 01 : ");
     A[0][1]=k.nextInt();
     System.out.println("Enter Element Index 02 : ");
     A[0][2]=k.nextInt();
      System.out.println("Enter Element Index 03 : ");
      A[0][3]=k.nextInt();
     System.out.println("Enter Element Index 04 : ");
     A[0][4]=k.nextInt();


      System.out.println("Enter Element Index 10 : ");
      A[1][0]=k.nextInt();
     System.out.println("Enter Element Index 11 : ");
      A[1][1]=k.nextInt();
     System.out.println("Enter Element Index 12 : ");
     A[1][2]=k.nextInt();
     System.out.println("Enter Element Index 13 : ");
      A[1][3]=k.nextInt();
     System.out.println("Enter Element Index 14 : ");
     A[1][4]=k.nextInt();
     

     System.out.printf("\n %d %d %d %d %d ",A[0][0],A[0][1],A[0][2],A[0][3],A[0][4]);
     System.out.printf("\n %d %d %d %d %d ",A[1][0],A[1][1],A[1][2],A[1][3],A[1][4]);
 }
}
 
