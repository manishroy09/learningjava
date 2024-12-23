//String task1 question no.3
import java.util.Scanner;
class st13{
    public static void main (String args[]){
      Scanner sk=new Scanner (System.in);
      System.out.println("Enter any String ");
      String s=sk.nextLine();

     boolean isString=true;
    
   if(s.length()<5 || s.length()>5){
    System.out.println(" Error ");
      }
     int count=0;
   if(s.length()==5){
     
   for(int i=0; i<s.length(); i++){
      char c=s.charAt(i);
      if(c>=0 && c<=9){
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
