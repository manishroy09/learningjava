import java.util.Scanner;
 public class Op6{
       public static void main(String args[]){
      int n,last;
      Scanner sk=new Scanner(System.in);
     System.out.println(" Enter Number : ");
     n=sk.nextInt();
  
   last=n%10;
  
  System.out.println("Last digit of the Number : "+last);
  System.out.println("Number Except last digit  : "+(n/10));



}
}