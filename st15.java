//string task1 question no. 5
import java.util.Scanner;
  class st15{
     public static void main (String args[]){

     String arr[]=new String[10];
       Scanner sk=new Scanner (System.in);
  for(int i=0; i<10; i++){
       System.out.println("Enter name :" +i);
        arr[i]=sk.nextLine();
       }
   for(int i=0; i<10; i++){
       String s=arr[i].toUpperCase();
       char c=s.charAt(0);
       if(c=='A'){
            System.out.println(arr[i]);
        }
    }

 }
}
  