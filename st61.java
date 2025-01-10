// string based task 6 --- question no 1

import java.util.Scanner;

class st61{
   public static void main(String args[]){
    Scanner sk = new Scanner(System.in);

   System.out.println("Input custom string = " );
   String s1 = sk.nextLine();
   StringBuffer buf1 = new StringBuffer(s1);
   
    System.out.println("String to be added ");
    String s2 = sk.nextLine();
    StringBuffer buf2 = new StringBuffer(s2);


    buf1.append(buf2);
    System.out.println(" If end position, output :" +buf1);
    
    StringBuffer buf3 = new StringBuffer(s1);
    buf3.insert(0,buf2);
    System.out.println(" If in beginning, output :" +buf3);
    
   StringBuffer buf4 = new StringBuffer(s1);
    buf4.insert(3,buf2);
    System.out.println(" If at 3rd index, output :" +buf4);
}

}