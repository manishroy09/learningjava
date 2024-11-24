//check character is upper case or lower case without using logical operator( in built function).or using nested if ,
import java.util.Scanner;
    public class cha{
           public static void main(String args[]){
            char c;
           Scanner od=new Scanner(System.in);

        System.out.println(" Enter any character ");
        c=od.next().charAt(0);

       if(c>='a'){
             if(c<='z'){
              System.out.println(" lower case ");
            }
       }
       else if(c>='A'){
             if(c<='Z'){
             System.out.println(" upper case  ");
    }
         }
       }
}



