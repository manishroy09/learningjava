import java.util.Scanner;
 public class pr1{
          public static void main(String args[]){
          int S1;
          int S;
          int M;
          int H;
          Scanner sc=new Scanner(System.in);



    
          System.out.println( "Input second : " );
          S1=sc.nextInt();

         H=S1/3600;
         M=(S1%3600)/60;
         S=(S1%3600)%60;


         System.out.println( "hour : " +H);
         System.out.println( "minute : " +M);
         System.out.println( "second : " +S);

}

}
       