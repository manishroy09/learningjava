// String task 4 -- Question no.3

import java.util.Scanner;
class st43{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String :");
   String s=sk.nextLine();

   String s1 = s.toLowerCase();

   

   String s2[] = s1.split(" ");
   
   String s3 = "the";
  int freq=0;
  for(int i=0; i<s2.length; i++){
     
     if(s2[i].equals(s3)==true){
    freq++;
     }
   }

   System.out.println("The frequency of the word "+s3+" is :" +freq );
 
    

 }

}