// string based task 6 --- question no 2

import java.util.Scanner;

class st62{
   public static void main(String args[]){
    Scanner sk = new Scanner(System.in);


    System.out.println("Enter any string :");
    String s = sk.nextLine();

   char arr[] = s.toCharArray();

 for( char a : arr){
    System.out.print("\t"+a);
}

}

}