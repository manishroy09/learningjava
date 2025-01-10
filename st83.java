// string based task 8 --- question no 3

import java.util.Scanner;

class st83{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter any string  :");
   String s=sk.nextLine();

     System.out.println("First Occurrence of 'o':"+(s.indexOf("o")));
     System.out.println("Last Occurrence of 'o':" +(s.lastIndexOf("o")));
   }

}