// String task 3 -- Question no.1

import java.util.Scanner;
class st31{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String 1 :");
   String s1=sk.nextLine();

   System.out.println("Enter String 2 :");
   String s2=sk.nextLine();

  if(s1.length()!=s2.length()){
     System.out.println("String are not equal");
    }

if(s1.length()==s2.length()){
     int a=s1.compareTo(s2);

    if(a==0){
       System.out.println("String are equal");
    }
  else{
    System.out.println("String are not equal");
  }
    }
  

}

}