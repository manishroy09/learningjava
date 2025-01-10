// string based task 6 --- question no 3

import java.util.Scanner;

class st63{
   public static void main(String args[]){
    Scanner sk = new Scanner(System.in);


    System.out.println("Enter any string :");
    String s = sk.nextLine();
    
    System.out.println(" Enter Index :");
    int i = sk.nextInt();

    char c = s.charAt(i);
    System.out.println(c);
   
}

}