// task 
import java.util.Scanner;
    public class c3{
       public static void main(String args[]){
        
      float f1,f2;
      Scanner g=new Scanner(System.in);

    System.out.println("Enter number 1 ");
    f1=g.nextFloat();
    System.out.println("Enter number 2 ");
    f2=g.nextFloat();

     
    switch(f1=f2){
        case '=':
          System.out.println( " Both are same ");
          break;
        case '!':
           System.out.println( " they are different ");
          break;
          
     }
        }
}