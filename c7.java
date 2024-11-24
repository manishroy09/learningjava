// task 
import java.util.Scanner;
    public class c7{
       public static void main(String args[]){
        
      int n1,n2,n3,n4,n5;
      Scanner sk=new Scanner(System.in);

    System.out.println("Enter Number  1 ");
    n1=sk.nextInt();
    System.out.println("Enter Number  2 ");
    n2=sk.nextInt();
    System.out.println("Enter Number 3  ");
    n3=sk.nextInt();
    System.out.println("Enter Number  4 ");
    n4=sk.nextInt();
    System.out.println("Enter Number  5 ");
    n5=sk.nextInt();
   
     int s=n1+n2+n3+n4+n5;
     float a=s/5;

    System.out.println("The sum of 5 no is : " +s );
    System.out.println("The Average is : " +a );
         
            }
}