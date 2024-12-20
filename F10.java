// String is anagram or not 
//taking somthing and returning nothing 

import java.util.Scanner;
class F10{

  public void anagram(){//formal argument 

     Scanner kb=new Scanner(System.in);
    System.out.println(" Enter String 1 : ");
    String s1=kb.nextLine();
    
    System.out.println(" Enter String 2 : ");
    String s2=kb.nextLine();

    if(s1.length()!=s2.length()){
      System.out.println(s1+" and " +s2+ " is not anagram ");
     }
      int count=0;
      if(s1.length()==s2.length()){
      
      for(int i=0; i<s1.length(); i++){
        char c=s1.charAt(i);
          for(int j=0; j<s2.length(); j++){
            char k=s2.charAt(j);
           if(c==k){
            count++;
             break;
            }
           }
         }
       }
           
         if(count==s1.length()){
            System.out.println(s1+" and " +s2+ " is  anagram ");
     }
         
         else{
            System.out.println(s1+" and " +s2+ " is not anagram ");
     }


         
     }

    public static void main(String args[]){

    
 
    F10 obj=new F10();

    obj.anagram();
       
  }
}
  