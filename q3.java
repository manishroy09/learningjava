// task
import java.util.Scanner;
    public class q3{
       public static void main(String args[]){
        
      int n;
      Scanner a=new Scanner(System.in);

    System.out.println("Enter number ");
    n=a.nextInt();
   

    switch(n%2){
       case 0:
          System.out.println("Even ");
          break;
        case 1:
         System.out.println(" Odd ");
        break;
      default :
         System.out.println(" nothing ");
    }
   
    }
}