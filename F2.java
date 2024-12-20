//program to check given number is even or not using function(using
//taking nothing returning nothing 

import java.util.Scanner;
class F2{

 public void evenOrOdd(){
 
   int n;
   Scanner sk=new Scanner(System.in);
   System.out.println("Enter any number : ");
   n=sk.nextInt();

  if(n%2==0){
     System.out.println( n+ " is even number ");
     }
    else{
      System.out.println( n+ " is odd number ");
     }
   }

   public static void main(String args[]){
     F2 obj=new F2();

   obj.evenOrOdd();
   obj.evenOrOdd();
  }
}
  