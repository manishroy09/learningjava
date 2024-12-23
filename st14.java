//String task1 question no.4
import java.util.Scanner;
class st14{
    public static void main (String args[]){
      Scanner sk=new Scanner (System.in);
      System.out.println("Enter any String ");
      String s=sk.nextLine();

     boolean isString=true;
    String s1=s.toLowerCase();
   if(s1.length()<6){
    System.out.println(" Error ");
      }
     int count=0;
   if(s1.length()>=6){
     
   for(int i=0; i<s1.length(); i++){
      char c=s.charAt(i);
      if(c>='a' && c<='z'){
       isString=true;    
       }
       else if(c>=0 && c<=9){
       isString=true;    
       }
       else if(c=='@'){
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
