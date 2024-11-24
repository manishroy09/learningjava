import java.util.Scanner;
       public class mul{
               public static void main(String args[]){

               int n1,n2;
               Scanner sk=new Scanner(System.in);
               

               System.out.println(" Enter number 1 " );
               n1=sk.nextInt();
               System.out.println(" Enter number 1 " );
               n2=sk.nextInt();

               if(n1%n2==0){
                   System.out.println(" multiple ");
               }
              else if(n2%n1==0){
                    System.out.println(" multiple ");
              }
             else {
                 System.out.println(" not multiple");
}


            
        }
}