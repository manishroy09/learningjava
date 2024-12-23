//program to check given number is even or not using function(using
//taking nothing returning nothing 

import java.util.Scanner;
class F2{

   public static String evenOrOdd(int n){
 
  if(n%2==0){
     return "even";   
     }
    else{
      return "odd";   

     }
   }

   public static void main(String args[]){
    
     Scanner sk=new Scanner(System.in);
   System.out.println("Enter any number : ");
   int n=sk.nextInt();

     F2 obj=new F2();
  
   String s=evenOrOdd(n);

   System.out.println(s); 
  }
}
  