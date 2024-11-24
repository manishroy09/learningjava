import java.util.Scanner;
   public class minutes{
                public static void main(String args[]){

                Scanner hr=new Scanner(System.in);
                               
                System.out.println(" Input hours : ");
                int H=hr.nextInt();
                System.out.println(" Input minutes : ");
                int min=hr.nextInt();

               int minutes=H*60+min;
                
                 


                System.out.println(" Minutes : " +minutes);
  }
 }