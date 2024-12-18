//taking nothing and returning nothing 
import java.util.Scanner;
class F1{

  public void add(){
    //step1: declare variable
     System.out.println("========>Enter Addition Function <==========");
    int a,b,c;

     //Input 
     

    
    Scanner kb=new Scanner(System.in);
    System.out.println(" Enter Value of A : ");
    a=kb.nextInt();
    
    System.out.println(" Enter Value of B : ");
    b=kb.nextInt();
 
    // Perform operation 

    c=a+b;
    
    // Print Result 

    System.out.println(" Addition : " +c);
     System.out.println("========>Exit Addition Function<=======");
     }
     

    public static void main(String args[]){
     System.out.println("Back to main funtion");

      System.out.println("========>Enter Main Function<=======");


    F1 obj=new F1();
    
    // How to access  method of class
    //objectName.methodName()

    obj.add();
      System.out.println("Back to main funtion");

      

    obj.add();
      System.out.println("========>Exit Main Function<=======");

       
  }
}
  