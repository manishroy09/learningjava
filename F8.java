//taking somthing and returning nothing 
// palindrome number or not 

import java.util.Scanner;
class F8{

  public void palindrome(int n){//formal argument 
    

    int rev=0;
    int n1=n;
    int i=0;
    while(n>0){
    int r=n%10;
    rev=rev*10+r;
    n=n/10;
    i++;
     }
     if(rev==n1){
       System.out.println(n1+ " is a Palindrome number");
      }
      else{
       System.out.println(n1+ " is not a Palindrome numver");
      }


     }

    public static void main(String args[]){

    Scanner kb=new Scanner(System.in);
    System.out.println(" Enter any number : ");
    int n=kb.nextInt();
    
     
    F8 obj=new F8();

    obj.palindrome(n);
       
  }
}
  