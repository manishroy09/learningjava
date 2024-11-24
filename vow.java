//vowel
import java.util.Scanner;
public class vow{
       public static void main(String args[]){
        char c;
        Scanner k=new Scanner(System.in);
            
    System.out.println( "Enter  Character : ");
    c=k.next().charAt(0);
            
    if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
      System.out.println("Character is vowel" );
      }
    else{
       System.out.println("Character is not a vowel" );
      }
 
}
}
       