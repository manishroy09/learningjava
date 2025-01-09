//Home work print even,odd, zero.
import java.util.Scanner;
    public class sy{
           public static void main(String args[]){
            int n;
           Scanner od=new Scanner(System.in);

        System.out.println(" Enter number ");
        n=od.nextInt();

       if(n==0){
              System.out.println(" zero ");
       }
       else if(n%2!=0){
             System.out.println(" Number is odd ");
         }
       else if(n%2==0){
           System.out.println("Number is even");
     }
}
}