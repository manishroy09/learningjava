// character is vowel or not, without using relation and logical operator 
import java.util.Scanner;
public class sw{
       public static void main(String args[]){
        char c;
        Scanner s=new Scanner(System.in);
            
    System.out.println( "Enter any character : ");
    c=s.next().charAt(0);

    switch(c){
     
     case 'a':
     case 'A':
      System.out.println("It is vowel");
       break;
     case 'e':
     case 'E':
      System.out.println("It is vowel");
       break;
      case 'i':
       case 'I':
      System.out.println("It is vowel");
       break;
      case 'o':
      case 'O':
      System.out.println("It is vowel");
       break;
       case 'u':
       case 'U':
      System.out.println("It is vowel");
       break;
   
     default:
      System.out.println(" It is not a vowel");
  }
    }
}
