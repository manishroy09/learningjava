//centigrade & farenhite;
// Assigment1 question
import java.util.Scanner;
    public class cen{
           public static void main(String args[]){
            int C,f;
           Scanner ce=new Scanner(System.in);

        System.out.println(" Enter centigrade ");
        C=ce.nextInt();
         
        f=(C*9)/5+32;
        
       System.out.print( "Farenhite : " +f);

       }
}