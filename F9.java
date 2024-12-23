//Strong number or not 
//taking somthing returning nothing 

import java.util.Scanner;
class F9{

 public void strongNumber(int n){
 
   int  n1=n;
   int sum=0;
      int i=0;
     while(n>0){
       int r=n%10;
       int fact=1;
       for(int j=r; j>0; j--){
          fact=fact*j;
          
          }
         sum=sum+fact;
         n=n/10;
         i++;
        }
       if(sum==n1){
         System.out.println(n1+ " is a Strong Number");
          }
         else{
          System.out.println(n1+ " is  not a Strong Number");
          }
     }

   public static void main(String args[]){

      Scanner sk=new Scanner(System.in);
   System.out.println("Enter any number : ");
   int n=sk.nextInt(); 

     F9 obj=new F9();

   obj.strongNumber(n);
   
  }
}
  