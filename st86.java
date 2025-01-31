// String task 8 -- Question no.6

import java.util.Scanner;
class st86{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String  :");
   String s=sk.nextLine();
   
   StringBuffer s1 = new StringBuffer(s);
    
  for(int i=0; i<s1.length(); i++){
     
     char c = s1.charAt(i);
      if(c>=32 && c<=47) {
       //special;
    }

   else if( c=='a' || c=='e'|| c=='i'|| c=='o' || c=='u'){
       // 
       }
    else{
       s1.deleteCharAt(i);
    }
   }
  System.out.println(s1);
}

}