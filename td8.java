//program to add two matrix

import java.util.Scanner;

class td9{
      public static void main(String args[]){
      int A[][]=new int[3][3];
      int B[][]=new int[3][3];
      int C[][]=new int[3][3];
       
      
      
      Scanner sk=new Scanner(System.in);
     int i,j;
     System.out.println("matrix A");
     for(i=0;i<3;i++){
         for(j=0;j<3;j++){
          System.out.println("Enter array index of "+i+j+ ": ");
      A[i][j]=sk.nextInt();
     }
    }//input matrix A
    
     System.out.println("matrix B");
  
      for(i=0;i<3;i++){
         for(j=0;j<3;j++){
          System.out.println("Enter array index of "+i+j+ ": ");
      B[i][j]=sk.nextInt();
     }
    }// input matrix B

     //Addition logic 
       for(i=0;i<3;i++){
         for(j=0;j<3;j++){
          for(K=0; K<0;K++){ 
            C[i][j]+=A[i][K]*B[K][j];
         }
        }
     }

         System.out.println("\nOutput Matrix A :");
      for(i=0;i<3;i++){
         for(j=0;j<3;j++){
      System.out.print("\t" +A[i][j]);
      }
     System.out.println(" ");
    }//output matrix A

      System.out.println("\nOutput Matrix B :");
      for(i=0;i<3;i++){
         for(j=0;j<3;j++){
      System.out.print("\t" +B[i][j]);
      }
     System.out.println(" ");
    }//output matrix B
    
     System.out.println("\nOutput Matrix C :");
      for(i=0;i<3;i++){
         for(j=0;j<3;j++){
      System.out.print("\t"+C[i][j]);
      }
       System.out.println(" ");
         }//output matrix c


}
}


