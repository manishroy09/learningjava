//to count no. of digit in the given number 
import java.util.Scanner;
public class l17{
       public static void main(String args[]){
        
    
     Scanner sk=new Scanner(System.in);
     System.out.println("Enter any number ");
     int n=sk.nextInt();

      int count=0;
          while(n!=0){
          count++;
            n=n/10;
           }
         System.out.println("Number  of digit : " +count);   
               
           }
}