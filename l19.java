//to print sum of even digit of given number  
import java.util.Scanner;
public class l19{
       public static void main(String args[]){
        
    
     Scanner sk=new Scanner(System.in);
     System.out.println("Enter any number ");
     int n=sk.nextInt();


    int sum=0;
   int r=0;
         for(n!=0){
            n%10=r;
             if(r%2==0){
            sum=sum+r;
            }
            n=n%10;
       }
        System.out.println(" Sum of even no. of digit :" +sum);
     
           }
}