//taking somthing and returning somthing 

import java.util.Scanner;
class F7{

   int  palindrome(int n){//formal argument 
    
    int rev=0;
    int n1=n;
    int i=0;
    while(n>0){
    int r=n%10;
    rev=rev*10+r;
    n=n/10;
    i++;
     }
     String result="";
      if(rev==n1){
        result="palindrome";
        }
       else{
          result="not palindrom";
         }
   
          return "result";

         }

    public static void main(String args[]){

    Scanner kb=new Scanner(System.in);
    System.out.println(" Enter Number  : ");
    int n=kb.nextInt();
    
    
 
    F7 obj=new F7();

    String r=obj.palindrome(n);
    System.out.println(r);
    
       
  }
}
  