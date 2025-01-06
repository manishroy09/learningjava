// String task 4 -- Question no.4

import java.util.Scanner;
class st44{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String  :");
   String s=sk.nextLine();

   String result = "";
   
   for(int i=0; i<s.length(); i++){
     char ch = s.charAt(i);
     if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
        result += ch;
      }
   }
 
  System.out.println("After removing the Output String :" +result); 
 }

}

