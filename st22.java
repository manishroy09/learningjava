//string task2 question no. 2

import java.util.Scanner;
  class st22{
     public static void main (String args[]){

     String arr[]=new String[10];
       Scanner sk=new Scanner (System.in);
  for(int i=0; i<10; i++){
       System.out.println("Enter name :" +i);
        arr[i]=sk.nextLine();
       }
   for(int i=0; i<10; i++){
       String s=arr[i].toLowerCase();
       
       if(s.contains("he")){
            System.out.println(arr[i]);
        }
    }

 }
}
  