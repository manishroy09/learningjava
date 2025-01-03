// String task 3 -- Question no.3

import java.util.Scanner;
class st33{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String 1 :");
   String s=sk.nextLine();

   int cons=0;
   int vowel=0;
   String s1=s.toLowerCase();
   for(int i=0; i<s.length(); i++){
      char c=s1.charAt(i);
      
      if(c>='0' && c<='9'){
            //skip the i 
     }
     if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
       vowel++;
     }
    else if(c>='a' && c<='z'){
      cons++;
    }
   }
    System.out.println("The total number of vowel in the string is : " +vowel);

  System.out.println("The total number of consonant in the string is : " +cons);
}

}

