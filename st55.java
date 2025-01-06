// String task 5 -- Question no.5

import java.util.Scanner;
class st55{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String :");
   String s=sk.nextLine();

   String arr[] = s.split(" ");
   

   System.out.println("String or words after split by space are : ");
   for(String x:arr){
    System.out.println(x);
   }
   
      

 }

}