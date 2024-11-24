//to print Fibonacci series

import java.util.Scanner;
    class l24{
        public static void main(String args[]){
        Scanner sk=new Scanner(System.in);
    
        System.out.println("Enter any number ");
        int n=sk.nextInt();
      
       int t1,t2,t3;
          t1=0;
          t2=1;
         System.out.print("\t " +t1+ "\t" +t2);
        for(int i=3;i<=n;i++){
         t3=t1+t2;
            System.out.print("\t" +t3);
          t1=t2;
          t2=t3;
         }

     }
}
