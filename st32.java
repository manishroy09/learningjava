// String task 3 -- Question no.2

import java.util.Scanner;
class st32{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String 1 :");
   String s=sk.nextLine();

   int alphabet=0;
   int digit=0;
   int special=0;
   
   String s1=s.toLowerCase();
   for(int i=0; i<s1.length(); i++){
      char c=s1.charAt(i);
      
      if(c>='0' && c<='9'){
            digit++; 
     }

    else if(c>='a' && c<='z'){
         alphabet++;
     }
     
     
    else {
       special++;
    }
   }
    System.out.println("Number of Alphabets in the string is : "
+alphabet);

  System.out.println("Number of Digit in the string is : " +digit);
  System.out.println("Number of Special character in the string is : " +special);
}

}