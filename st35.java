// String task 3 -- Question no.5

import java.util.Scanner;
class st35{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String 1 :");
   String s=sk.nextLine();

    
       char arr[] = 0;
   for(int i=0; i<s.length(); i++){
       char c = charAt(i);
       for(int j=i+1; j<s.length(); j++){
              char k = charAt(j);
           if(c.compareTo(k)<0){
               arr[i] = k;
            }
          
       }
              
         
     }
  System.out.println("After sorting the string appears like : " +arr);

 }

}