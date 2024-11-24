//to check given number is even or odd ,zero
import java.util.Scanner;
public class swi{
       public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
            
    System.out.println( "Enter any number : ");
    n=s.nextInt();

    switch(n%2){
     
     case 0:
     System.out.println("even");
       break;
     case 1:
     
      System.out.println(" odd");
       break;

      
       default:
      System.out.println("nothing");
       
              }
    }
}
 