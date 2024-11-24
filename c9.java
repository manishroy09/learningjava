// task 
import java.util.Scanner;
    public class c9{
       public static void main(String args[]){
        
      int n1,n2,n3;
      Scanner g=new Scanner(System.in);

    System.out.println("Enter number 1");
    n1=g.nextInt();
     System.out.println("Enter number 2");
     n2=g.nextInt();
     System.out.println("Enter number 3");
     n3=g.nextInt();
   
    if(n1>n2 && n2>n3){
        
        System.out.println(" Decreasing order " );  
     }
        else if(n3>n2 && n2>n1){
          System.out.println(" Increasing order " );
             }
         
      else  {
         System.out.println(" Neither increasing nor decreasing ");
      }
      
     }
}