import java.util.Scanner;
public class q12{
       public static void main(String args[]){
        int n;
        Scanner sk=new Scanner(System.in);
        String result="";
    
    System.out.println( "Enter the number ");
    n=sk.nextInt();
     
    result=n%2==0 ? "Even Number " : " odd number";

    System.out.println(result);
       

}
}
       