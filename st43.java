// String task 4 -- Question no.3

import java.util.Scanner;
class st43{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String 1 :");
   String s=sk.nextLine();

   String s1 = s.toLowerCase();

   

   String split[] = s1.split(" ");
   
   int freq=0;
  
  for(int i=0; i<split.length(); i++){
     if( split[i]=="the"){
    freq++;
     }
   }

   System.out.println("The frequency of the word "the" is : " +freq);
 
    

 }

}