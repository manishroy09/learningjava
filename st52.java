// String task 5 -- Question no.2

import java.util.Scanner;
class st52{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String in lowercase :");
   String s=sk.nextLine();

   String result = "";
   
   for(int i=0; i<s.length(); i++){
     char ch = s.charAt(i);
     if(ch>='a' && ch<='z'){
        result += (char)(ch-32);
      }
       else{
        result += ch;
     }
   }
 
  System.out.println("Here is above stirng in UPPERCASE:" +result); 
 }

}

