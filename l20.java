// write a program to reverse no .
import java.util.Scanner;
     public class l20{
          public static void main(String args[]){
          Scanner sk=new Scanner(System.in);
          System.out.println(" Enter any number ");
          int n=sk.nextInt();


       int res=0;
       while(n!=0){
        int r=n%10;
        res=res*10+r;
        n=n/10;
         }
       System.out.println("reverse of the number is : " +res);
        }
}
          