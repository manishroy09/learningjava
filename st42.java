// String task 4 -- Question no.2

import java.util.Scanner;
class st42{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String 1 :");
   String s=sk.nextLine();

    System.out.println("The given sentence is : " +s);
       char s1[]=new char[s.length()];
   for(int i=0; i<s.length(); i++){
     char c=s.charAt(i);
       if(c>='A' && c<='Z'){
          char k=c.toLowerCase();
          s1[i]=k;
         }
       else if(c>='a' &&  c<='z'){
          char k=c.toUpperCase();
          s1[i]=k; 
         }       
         
     }
   for(int i=0; i<s.length(); i++){
  System.out.println("After Case changed the string is : " +s1[i]);
   }

 }

}