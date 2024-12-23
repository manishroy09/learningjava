//String task1 question no.2
import java.util.Scanner;
class st12{
    public static void main (String args[]){
      Scanner sk=new Scanner (System.in);
      System.out.println("Enter any String ");
      String s=sk.nextLine();

     boolean isString=true;
    String s1=s.toLowerCase();
   if(s1.length()<3){
    System.out.println(" Error ");
      }
     int count=0;
   if(s1.length()>=3){
     
   for(int i=0; i<s1.length(); i++){
      char c=s1.charAt(i);
      if(c>='a' && c<='z'){
       isString=true;    
       }
    else{
      count++;

      }
   }
 }
  if(count>0){
    System.out.println(" Error ");
   }
  
}
}
