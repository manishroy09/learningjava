// to  print sum of all element of 2d array

import java.util.Scanner;

class td6{
      public static void main(String args[]){
      int A[][]=new int[3][3];
       
      int sum=0;
      int r,c;
      Scanner sk=new Scanner(System.in);
     for(r=0;r<3;r++){
         for(c=0;c<3;c++){
      
      System.out.println("Enter element "+r+c+ ": ");
      A[r][c]=sk.nextInt();
           }
    }
         
      }
  for(r=0;r<3;r++){

         sum=sum+A[r];
      }
       
      System.out.println(" sum of element of " +r+ ":" +sum);
        

}
}


