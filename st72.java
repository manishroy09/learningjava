// string based task 7 --- question no 2

import java.util.Scanner;

class st72{
   public static void main(String args[]){
    Scanner sk = new Scanner(System.in);


    System.out.println("Enter any string :");
    String s = sk.nextLine();
    
    int i=0; 
    while( i<s.length() && s.charAt(i) == '0'){
        i++;
      }
      if( i == s.length()){
       System.out.println("");
      }
       else{
         System.out.println(s.substring(i));
     }
       
}

}