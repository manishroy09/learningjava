// task 
import java.util.Scanner;
    public class q1{
       public static void main(String args[]){
        
      int N;
      Scanner n=new Scanner(System.in);

    System.out.println("Enter number");
    N=n.nextInt();
   
    if(N==0){
        System.out.println(" Zero ");
      }
     else if (N>0){
       System.out.println(" Positive number ");
       }
      else {
         System.out.println(" Negative number ");
    }
}
}