// string based task 8 --- question no 2

import java.util.Scanner;

class st82{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter any string  :");
   String s=sk.nextLine();

     if(s.contains("orange") == false){
        System.out.println(" orange is not present in the Sentence");
      }
      else{
       System.out.println(" orange is present in the sentence  : YES");
     }

   }

}