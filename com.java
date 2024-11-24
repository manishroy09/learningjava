//compare number
import java.util.Scanner;
public class com{
       public static void main(String args[]){
        int n1,n2;
        Scanner k=new Scanner(System.in);
            
    System.out.println( "Enter  number1 : ");
    n1=k.nextInt();
    System.out.println( "Enter  number1 : ");
    n2=k.nextInt();
        
    if(n1>=n2){
      System.out.println("Number1 is Greater" );
      System.out.println("This is if 1 ");
}
    if(n2>=n1){
       System.out.println("Number2 is Greater" );
      System.out.println("This is if 2 ");
}
 if(n2==n1)
       System.out.println("Both number are equal" );
      System.out.println("This is if 3 ");



}
}
       