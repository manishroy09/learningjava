import java.util.Scanner;
  public class pr2{
           public static void main(String args[]){
           
           Scanner da=new Scanner(System.in);
           System.out.println(" Input Number of days : " );
           int d=da.nextInt();
          
          
           int Y=d/365;
           int M=(d%365)/30;
           int D=d%30;

           System.out.println(" Years : " +Y);
           System.out.println(" Months : " +M);
           System.out.println(" Days : " +D);


  }
}

            

           