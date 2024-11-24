// task
import java.util.Scanner;
   class lth9{
       public static void main(String args []){
       Scanner sk=new Scanner(System.in);
       
       System.out.println(" Enter any number ");
       int n=sk.nextInt();

     int r;
     int sum=0;
     int prd=1;
     int add;
     int m=n;
       while(n!=0){
         r=n%10;
         sum=sum+ r;
         prd=prd*r;
         
         n=n/10;
         }
        add=sum+prd;
      if(add==m){
         System.out.println(" Special Two-digit number ");
        }
       else{
       System.out.println( " Not a special Two-digit number ");
      }
  }
}
       

