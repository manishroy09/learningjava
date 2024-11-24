// task 
import java.util.Scanner;
    public class c6{
       public static void main(String args[]){
        
      int y;
      Scanner sk=new Scanner(System.in);

    System.out.println("Enter year ");
    y=sk.nextInt();

    switch(y%4){
      
     case 0 :
      System.out.println(  y+ " is a leap year");
       break;
        
     default:
      System.out.println(  y+ " is not a leap year");
     }

         
     }
}