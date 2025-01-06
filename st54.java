// String task 5 -- Question no.4

import java.util.Scanner;
class st54{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter a string :");
   String s=sk.nextLine();

   String result = "";
   
   for(int i=0; i<s.length(); i++){
     char ch = s.charAt(i);
     if(ch == ' '){
        result += '*';
      }
       else{
        result += ch;
     }
   }
 
  System.out.println("After replacing the space with * the new strin is :" +result); 
 }

}

