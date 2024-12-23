// area  and parameter of circle using funtion in oops
import java.util.Scanner;
class Circle{
    float r;
    
   void acceptData(){
       Scanner sk=new Scanner (System.in);
        System.out.println("Enter Radius of circle :");
     r=sk.nextFloat();
}

  void showData(){
            
     System.out.println(" Radius of circle is :" +r);
    
    
    }

void getArea(){
            
     System.out.println(" Area is :" +(3.14*r*r)); 
    
    
    }

void getPara(){
            
     System.out.println(" Parameter:" +(2*3.14*r));
    
    
    }

public static void main(String args[]){
   Circle r=new Circle();

 r.acceptData();
 r.showData();
 r.getArea();
 r.getPara();

}
}

