// task
import java.util.Scanner;
   class lth10{
       public static void main(String args []){
       Scanner sk=new Scanner(System.in);
       
       System.out.println(" Enter any number ");
       int n=sk.nextInt();
     int r=0;
     int count=0;
     while(n!=0){
                             
       r=n%10;
        if(r==0){
           count++;
           }
          n=n/10;
        } 
         if(count>0){
           System.out.println(" Duck number ");
              }
         else {
             System.out.println(" Not a Duck number ");
            }         
         
       }
}
