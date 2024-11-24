// print table of given number  using  for loop;
import java.util.Scanner;
public class l10{
       public static void main(String args[]){
        
     int n,i;
     Scanner sk=new Scanner(System.in);
     System.out.println("Enter any number ");
     n=sk.nextInt();

      
        for(i=1;i<=10;i++){
           
          System.out.println(n+ " * " +i+ " = " +(n*i));
          }
       
           }
}