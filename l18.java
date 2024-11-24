//to print sum of even digit of given number  
import java.util.Scanner;
public class l18{
       public static void main(String args[]){
        
    
     Scanner sk=new Scanner(System.in);
     System.out.println("Enter any number ");
     int n=sk.nextInt();

      int sum=0;
          while(n!=0){
          int r=n%10;
          if(r%2==0){
             sum=sum+r;
           }
            n=n/10;
           }
         System.out.println("sum of all even digit : " +sum);   
               
           }
}