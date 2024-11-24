import java.util.Scanner;
public class swit{
       public static void main(String args[]){
        char c;
        int n1,n2;
        Scanner s=new Scanner(System.in);
   
       System.out.println(" Enter any choice");
       System.out.println("press + for addition");
       System.out.println("press - for subtraction");
       System.out.println("press * for multiplication");
       System.out.println("press / for division");
       System.out.println("================");
       c=s.next().charAt(0);
       System.out.println("===================");


    System.out.println( "Enter  number1 : ");
    n1=s.nextInt();
    System.out.println( "Enter  number2 : ");
    n2=s.nextInt();

    switch(c){
     
     case '+' :
     System.out.println(" addition :" +(n1+n2));
       break;
    case '-' :
     System.out.println(" addition :" +(n1-n2));
       break;
     case '*' :
     System.out.println(" addition :" +(n1*n2));
       break;
       case '/' :
     System.out.println(" addition :" +(n1/n2));
       break;
      
      default:
      System.out.println("nothing");
       
              }
    }
}
