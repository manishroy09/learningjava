// String task 5 -- Question no.1

import java.util.Scanner;
class st51{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String :");
   String s=sk.nextLine();

   String s2[] = s.split(" ");
   for(int i=0; i<s2.length; i++){
      for(int j=0; j<s2.length; j++){
       if(s2[i].length()>s2[j].length()){
            String temp = s2[i];
                s2[i] = s2 [j];
                s2[j] = temp;
         }
      }
   }
  System.out.println("The largest word is : " +s2[0]);
   System.out.println("and the smallest word is :" +s2[s2.length-1]); 
    
 }

}