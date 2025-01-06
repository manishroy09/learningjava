// String task 4 -- Question no.5

import java.util.Scanner;
class st45{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String :");
   String s=sk.nextLine();

   System.out.println("Enter character :");
   char c=sk.next().charAt(0);
   String s1 = s.toLowerCase();
     
    int freq = 0; 
     for(int i=0; i<s1.length(); i++){
         char x = s1.charAt(i);
        if(x == c){
           freq++;
         }
     }
    System.out.println("The frequency of i is : " +freq);
 
    }

}