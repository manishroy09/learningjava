// String task 3 -- Question no.4

import java.util.Scanner;
class st34{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String 1 :");
   String s=sk.nextLine();

      int freq[] = new int[s.length()];
   String s1=s.toLowerCase();
   for(int i=0; i<s1.length(); i++){
        char r = s1.charAt(i);
        freq[i]=1;
      for(int j=i+1; j<s1.length(); j++){
         char l = s1.charAt(j);
        if(r==l){
          freq[i]++;
         }
       }
    }
          int maxchar=freq[0];
       for(int i=0; i<s1.length(); i++){
             if(freq[i]>maxchar){
                   maxchar=freq[i];
                   char c= s1.charAt(i);
              System.out.println("The Highest frequency of character " +c);
            }
       }
            
      
    
    System.out.println(" appears number of times : " +maxchar); 
}

}