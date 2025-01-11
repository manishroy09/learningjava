// string based task 8 --- question no 4

import java.util.Scanner;

class st84{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter any string  :");
   String s=sk.nextLine();

    String arr[] = s.split(" ");
    
    char f = arr[0].charAt(0);
    char m = arr[1].charAt(0);
    
    System.out.println(f+"."+m+"." +arr[2]);
   }

}