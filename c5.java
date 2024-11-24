// task 
import java.util.Scanner;
    public class c5{
       public static void main(String args[]){
        
      char c;
      String str;
     Scanner g=new Scanner(System.in);

    System.out.println("Enter any character ");
     str=g.nextLine();
     c=str.charAt(0);
    
   

    if (str.length() > 1 || !Character.isLetter(str.charAt(0))) {
            System.out.println("Error");
        } else {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println("Input letter is a vowel");
            } else {
                System.out.println("Input letter is a consonant");
            }
        }


  
   
         
            }
}