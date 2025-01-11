// String task 8 -- Question no.5

import java.util.Scanner;
class st85{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String  :");
   String s=sk.nextLine();

   int con = 0;
   int vowel=0;
   int digit=0;
   int special=0;
   int space= 0;
  
   
   String s1=s.toLowerCase();
   for(int i=0; i<s1.length(); i++){
      char c=s1.charAt(i);
      
      if(c>='0' && c<='9'){
            digit++; 
     }

   
    else if(c>=32 && c<=47) {
       special++;
    }
     else if(c==' ') {
       space++;
    }

   else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
         vowel++;
     }
    else if(c>='a' && c<='z'){
       con++;
    }
     
     
   }
    System.out.println("vowel: "+vowel);

  System.out.println("consonant : " +con);
 System.out.println("Digit : " +digit);

  System.out.println("Special Character : " +special);
}

}