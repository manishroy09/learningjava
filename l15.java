// to check given no is perfect number 
// perfect no. is a positive no. that is equal to the sum of proper divisor //excluding itself.
import java.util.Scanner;
public class l15{
       public static void main(String args[]){
        
    
     Scanner sk=new Scanner(System.in);
     System.out.println("Enter any number ");
     int n=sk.nextInt();

      int sum=0;
       for(int i=1; i<n;i++){
       if(n%i==0){
          sum=sum+i;
          }
       }
   
       if(n==sum){
        System.out.println( "This is a perfect number" );
        }
        else{
           System.out.println("This is not a perfect number ");
         }
     
      
               
           }
}