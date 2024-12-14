 import java.util.Scanner;
 class Uppercase{
    public static void main(String args[]){
    Scanner sk=new Scanner(System.in);
     System.out.println("Enter Any String : ");
     String s=sk.nextLine();
     String r="";
   for(int x:s.toCharArray()){
     if(x>='a'&&x<='z'){
       x=x-32;
       r=r+(char)x;
       }
       else{
          r=r+(char)x;
         }
      }
     System.out.println(r);
  }
 }
