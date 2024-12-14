//program to check given string is anagram or not 
import java.util.Scanner;
 class Sb10{
     public static void main(String args[]){
      
        Scanner sk=new Scanner(System.in);
        

        System.out.println("Enter String 1 :");
        String s1=sk.nextLine();
      
        System.out.println("Enter String 2 :");
        String s2=sk.nextLine();

        if(s1.length()!=s2.length()){
           System.out.println( "Not anagram number ");
           }
       int count=0;
       if(s1.length()==s2.length()){
         
         for(int i=0; i<s1.length(); i++){
             char c=s1.charAt(i);
             for(int j=0; j<s2.length(); j++){
              char k=s2.charAt(j);
              if( c==k){
                 count++;
                 break;
                 }
              }
          }
      }
    if(count==s1.length()){
       System.out.println("anagram number ");
      }
      else{
       System.out.println(" not anagram number");
      }


}
}
 