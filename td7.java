// to  print sum of all element of  column wise in 2d array

import java.util.Scanner;

class td7{
      public static void main(String args[]){
      int A[][]=new int[3][3];
       
      
      int r,c;
      Scanner sk=new Scanner(System.in);
     for(r=0;r<3;r++){
         for(c=0;c<3;c++){
      
      System.out.println("Enter element "+r+c+ ": ");
      A[r][c]=sk.nextInt();

           }
         }
        int num[]=new int[3]; 
     int sum;
  for(r=0;r<3;r++){
     sum=0;
      for(c=0; c<3; c++){
           System.out.print("\t" +A[r][c]);
            sum=sum+A[c][r];
          }
       num[r]=sum;
      System.out.println(" " );
      
        }
      for(int i=0; i<num.length; i++){
         System.out.print("\t" +num[i]);
       }
}
}


