//score , print grade 
import java.util.Scanner;
public class sco{
       public static void main(String args[]){
        int c;
        Scanner k=new Scanner(System.in);
            
    System.out.println( "Enter  Score : ");
    c=k.nextInt();
            
    if(c>=90){
      System.out.println("A grade " );
      }
    else if(c>=80 && c<=89){
       System.out.println("B grade ");
  }
    else if(c>=70 && c<=79){
       System.out.println(" C grade" );
      }
    else if(c>=60 && c<=69){
       System.out.println(" D grade" );
      }

    else{
       System.out.println("Fail ");
  }
 
}
}
       