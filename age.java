// write a java program to check you are eligible for voting or not ?
import java.util.Scanner;
public class age{
       public static void main(String args[]){
        int n;
        Scanner sk=new Scanner(System.in);
        String result="";
    
    System.out.println( "Enter  number1 ");
    n=sk.nextInt();
        
    result=n>18 ? "You are eligible for voting " :  " You are note eligible for voting ";

    System.out.println(result);
       

}
}
       