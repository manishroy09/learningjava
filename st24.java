//string task2 question no. 4

import java.util.Scanner;
  class st24{
     public static void main (String args[]){

      Scanner sk=new Scanner(System.in);
        System.out.println("Enter Any String :");
       String str=sk.nextLine();

    System.out.println("Reverse of String");

    for(int i=str.length()-1; i>=0; i--){
        System.out.print(str.charAt(i));
       }
 }
}
  