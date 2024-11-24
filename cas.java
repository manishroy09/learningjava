//else if // given character is upper case, lower case , digit , special character
import java.util.Scanner;
public class cas{
       public static void main(String args[]){
        char c;
        Scanner k=new Scanner(System.in);
            
    System.out.println( "Enter  Character : ");
    c=k.next().charAt(0);
            
    if(c>='A' && c<='Z'){
      System.out.println("Character is in upper case " );
      }
    else if(c>='a' && c<='z'){
       System.out.println("character is in lowerb case ");
  }
    else if(c>=0 && c<=9){
       System.out.println(" Digit" );
      }
    else{
       System.out.println("special charecter ");
  }
 
}
}
       