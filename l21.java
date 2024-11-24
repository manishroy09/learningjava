// to check given no. is palindrome number or not 
// a number that remain same its digits are reverser

import java.util.Scanner;
     public class l21{
          public static void main(String args[]){
          Scanner sk=new Scanner(System.in);
          System.out.println(" Enter any number ");
          int n=sk.nextInt();

      int m=n;
       int res=0;
       while(n!=0){
        int r=n%10;
        res=res*10+r;
        n=n/10;
         }
      if(m==res){
       System.out.println(" the is a palindrome number " );
      }
       else{
          System.out.println(" the is not a palindrome number " );
           }
        }
}
          