//taking somthing and returning nothing 

import java.util.Scanner;
class F6{

   int  add(int a, int b){//formal argument 
    

    int c=a+b;

    return c;
     }

    public static void main(String args[]){

    Scanner kb=new Scanner(System.in);
    System.out.println(" Enter Number 1 : ");
    int n1=kb.nextInt();
    
    System.out.println(" Enter Number 2: ");
    int n2=kb.nextInt();
 
    F6 obj=new F6();

    int r=obj.add(n1,n2);
    System.out.println("Addition : " +r);
       
  }
}
  