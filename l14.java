//to print factorial of given number 
import java.util.Scanner;
public class l14{
       public static void main(String args[]){
        
    
     Scanner sk=new Scanner(System.in);
     System.out.println("Enter any number ");
     int n=sk.nextInt();

      int fact=1;
       for(int i=n; i>=1;i--){
          fact=fact*i;
       }
        System.out.println( "Factorial of the given number :" +fact);
     
      
               
           }
}