//to check given no. is prime or not using function(taking nothing and //returning nothing

import java.util.Scanner;
class F3{

   public void checkPrime(){
 
   int n;
   Scanner sk=new Scanner(System.in);
   System.out.println("Enter any number : ");
   n=sk.nextInt();

   int count=0;
  for(int i=2;i<n; i++){
       if(n%i==0){
        count++;
        break;
        }
      }
     if(count>0){
         System.out.println(n+ " is not a prime number ");
       }
       else{
         System.out.println(n+ " is a prime number");
       }

          

   }

   public static void main(String args[]){
     F3 obj=new F3();

   obj.checkPrime();
   obj.checkPrime();
  }
}
  