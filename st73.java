// string based task 7 --- question no 3

import java.util.Scanner;

class st73{
   public static void main(String args[]){
    Scanner sk = new Scanner(System.in);


    System.out.println("Enter any string :");
    String s = sk.nextLine();
    StringBuffer s1 = new StringBuffer(s);
    
    System.out.println(s1.reverse());      
}

}