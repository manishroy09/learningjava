// string based task 7 --- question no 1

import java.util.Scanner;

class st71{
   public static void main(String args[]){
    Scanner sk = new Scanner(System.in);


    System.out.println("Enter any string :");
    String s = sk.nextLine();
    StringBuffer s1 = new StringBuffer(s);
     
    
    System.out.println(" Enter Index :");
    int i = sk.nextInt();

    System.out.println(" Enter Index :");
    char c = sk.next().charAt(0);

    s1.setCharAt(i, c);

  System.out.println(s1);
       
}

}