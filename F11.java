// panagrame number
// taking nothing returning somthing 

import java.util.Scanner;
class F11{
    String panagram(){
     Scanner sk=new Scanner(System.in);
     System.out.println("Enter any string");
     String s=sk.nextLine();

     
     String s1=s.toLowerCase();
   if(s1.length()<26){
       return "not a Panagram";
     }
      else{
    for(char c='a'; c<'z'; c++){
      if(s1.indexOf(c)<0){
        return "not a Panagram";
         }
      }
     }
     return "Panagram";
  }

   public static void main (String args[]){
    
  F11 obj=new F11();
  
  String s=obj.panagram();

     System.out.println(s);
}
}
