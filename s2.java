//to print character of the given string 
import java.util.Scanner;
   class s2{
       public static void main(String args []){

     Scanner sk=new Scanner(System.in);
     System.out.println("Enter string :");
     String str=sk.nextLine();
     for(int i=0; i<str.length();i++){
     char x=str.charAt(i);
     System.out.println(x);
    }

  }
}