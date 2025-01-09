// print table of given number  using do while loop;
import java.util.Scanner;
public class l9{
       public static void main(String args[]){
        
     int n,i;
     Scanner sk=new Scanner(System.in);
     System.out.println("Enter any number ");
     n=sk.nextInt();

       i=1;
        do{
           
          System.out.println(n+ " * " +i+ " = " +(n*i));
          
       i++;
      }while(i<=10);

     }
}