// string based task 8 --- question no 1

import java.util.Scanner;

class st81{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter any string  :");
   String s=sk.nextLine();
     if(s.indexOf('e')<0){
        System.out.println(" e is present in the word : NO");
      }
      else{
       System.out.println(" e is present in the word : YES");
     }

   }

}