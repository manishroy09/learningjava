import java.util.Scanner;
public class q13{
       public static void main(String args[]){
        int a,b ;
        Scanner sk=new Scanner(System.in);
        String result="";
    
    System.out.println( "Enter  number1 ");
    a=sk.nextInt();
    System.out.println( "Enter  number2 ");
    b=sk.nextInt();
     
    result=a==b ? "Both are equal" : a>b ? " Number1 is greater " : " Number2 is  greater ";

    System.out.println(result);
       

}
}
       