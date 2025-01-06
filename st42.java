// String task 4 -- Question no.2

import java.util.Scanner;
class st42{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String  :");
   String s=sk.nextLine();

    System.out.println("The given sentence is : " +s);
      String result = "";

   for(int i=0; i<s.length(); i++){
       char c = s.charAt(i);
       if(c>='A' && c<='Z'){
          result = result + (char)(c+32);
          
         }
       else if(c>='a' &&  c<='z'){
          result = result + (char)(c-32); 
         }  
        else{
          result = result + c; 
     }
   
    }
System.out.println("After case changed the string is : "+result);

 }

}