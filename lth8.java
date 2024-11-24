// task
import java.util.Scanner;
   class lth8{
       public static void main(String args []){
       Scanner sk=new Scanner(System.in);
       
       System.out.println(" Enter any number ");
       int n=sk.nextInt();

     int r;
     int sum=0;
     int prd=1;
       while(n!=0){
         r=n%10;
         sum=sum+ r;
         prd=prd*r;
         n=n/10;
         }
      if(sum==prd){
         System.out.println(" The number is a Spy number");
        }
       else{
       System.out.println( " The number is not a Spy number ");
      }
  }
}
       
