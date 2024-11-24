// task 
import java.util.Scanner;
   class lth6{
       public static void main(String args []){
       Scanner sk=new Scanner(System.in);
       
       System.out.println(" Enter any number ");
       int n=sk.nextInt();

     int fact=1;
     int sum=0;
      
      int m=n;
     
        for(int i=1;i<=n;i++){
       fact=fact*i;
       
        sum=sum + fact;  
      }
      if(sum>m){
         System.out.println(" The Number is a abundant number");
        }
       else{
       System.out.println( " The Number is not a abundant number ");
      }
  }
}
       
         