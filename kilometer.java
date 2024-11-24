import java.util.Scanner;
   public class kilometer{
                public static void main(String args[]){

                Scanner km=new Scanner(System.in);
                               
                System.out.println(" Input kilomeret per hour : ");
                int kilo=km.nextInt();
                
                double mile=kilo*0.6213712;


                System.out.println(" miles per hour : " +mile);
  }
 }