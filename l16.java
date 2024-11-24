//to print sum of digits of the given number 
import java.util.Scanner;
public class l16{
       public static void main(String args[]){
        
    
     Scanner sk=new Scanner(System.in);
     System.out.println("Enter any number ");
     int n=sk.nextInt();

      int sum=0;
          while(n!=0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
           }
         System.out.println(" Sum of digit : " +sum);   
               
           }
}