// String task 4 -- Question no.1

import java.util.Scanner;
class st41{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   
    System.out.println("Enter String 1 :");
      String s1=sk.nextLine();
    System.out.println("Enter String to search :");
     String s2=sk.nextLine();
   

   if(s1.contains(s2)== true){
      System.out.println("The substring is exist in the string ");
    }
   else{
     System.out.println("The substring is not exist in the string");
    }

    
     }

}