//taking somthing and returning nothing 

import java.util.Scanner;
class F4{

  public void add(int a, int b){//formal argument 
    

    int c=a+b;

    System.out.println(" Addition : " +c);

     }

    public static void main(String args[]){

    Scanner kb=new Scanner(System.in);
    System.out.println(" Enter Number 1 : ");
    int n1=kb.nextInt();
    
    System.out.println(" Enter Number 2: ");
    int n2=kb.nextInt();
 
    F4 obj=new F4();

    obj.add(n1,n2);
       
  }
}
  