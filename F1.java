//taking nothing and returning nothing 
import java.util.Scanner;
class F1{

  public void add(){
    int a,b,c;
    System.out.println("========> Add Function is called <==========");
    Scanner kb=new Scanner(System.in);
    System.out.println(" Enter Value of A : ");
    a=kb.nextInt();
    
    System.out.println(" Enter Value of B : ");
    b=kb.nextInt();
 
    c=a+b;
    
    System.out.println(" Addition : " +c);
     }

    public static void main(String args[]){
    F1 obj=new F1();

    obj.add();
    obj.add();
    obj.add();
    obj.add();
    obj.add();
   
  }
}
  