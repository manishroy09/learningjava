// if alse and terniary operator
import java.util.Scanner;
public class q11{
       public static void main(String args[]){
        int n;
        Scanner sk=new Scanner(System.in);
        String result="";
    
    System.out.println( "Enter the number ");
    n=sk.nextInt();
     
    result=n>0 ? "Positive number " : " Negative number";

    System.out.println(result);
       

}
}
       