// print table of given number  using  while loop;
import java.util.Scanner;
public class l8{
       public static void main(String args[]){
        
     int n,i;
     Scanner sk=new Scanner(System.in);
     System.out.println("Enter any number ");
     n=sk.nextInt();

       i=1;
        while(i<=10){
           
          System.out.println(n+ " * " +i+ " = " +(n*i));
          
       i++;
      }

     }
}