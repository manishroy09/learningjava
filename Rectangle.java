import java.util.Scanner;
class Rectangle{
    int l;
    int b;
   void acceptData(){
       Scanner sk=new Scanner (System.in);
     System.out.println("Enter length :");
     l=sk.nextInt();
    System.out.println("Enter breath :");
     b=sk.nextInt();
}

  void showData(){
            
     System.out.println(" length is :" +l);
    
    System.out.println(" length is :" +b);
    }

void getArea(){
            
     System.out.println(" Area is :" +(l*b));
    
    
    }

void getPara(){
            
     System.out.println(" Parameter:" +(2*(l+b)));
    
    
    }

public static void main(String args[]){
   Rectangle r=new Rectangle();

 r.acceptData();
 r.showData();
 r.getArea();
 r.getPara();

}
}

