//to print reverse character of the given string 
import java.util.Scanner;
   class s3{
       public static void main(String args []){

     Scanner sk=new Scanner(System.in);
     System.out.println("Enter string :");
     String str=sk.nextLine();
     for(int i=str.length()-1; i>=0;i--){
     char x=str.charAt(i);
     System.out.println(x);
    }

  }
}