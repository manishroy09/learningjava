//taking nothing and returning somthing

import java.util.Scanner;
class F5{

    int add(){//formal argument 
    
    int n1,n2;
    
    Scanner kb=new Scanner(System.in);
    System.out.println(" Enter Number 1 : ");
     n1=kb.nextInt();
    
    System.out.println(" Enter Number 2: ");
     n2=kb.nextInt();

    int c=n1+n2;

    return c;

     }

    public static void main(String args[]){

    F5 obj=new F5();

    int r=obj.add();
    System.out.println("Addition : " +r);
       
  }
}
  