// task
import java.util.Scanner;
    public class q2{
       public static void main(String args[]){
        
      int n1,n2;
      Scanner n=new Scanner(System.in);

    System.out.println("Enter number 1");
    n1=n.nextInt();
    System.out.println("Enter number 2");
    n2=n.nextInt();
   
    if(n1>n2){
        System.out.println(" Number 1 is greater  ");
      }
           else if(n1<n2){
         System.out.println(" Number 2 is greater ");
    }
   else {
      System.out.println(" equal ");
    }
}
}