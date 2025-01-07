// static method 
class point7 {
 int x;
 int y; 
 static int count;
 
 public point7(){
   count++;
  }
public static int getctr(){
   return count;
 }

public static void main(String args[]){
  
point7 p1= new point7();
point7 p2= new point7();
point7 p3= new point7();
point7 p4= new point7();
point7 p5= new point7();

System.out.println(p1.count);
System.out.println("Number of Object is created :"+count );
System.out.println("Number of Object is created :" +point7.count);
System.out.println("======= static method is called =========" );
System.out.println("Number of Object is created :" +p1.getctr());
System.out.println("Number of Object is created :"+getctr() );
System.out.println("Number of Object is created :" +point7.getctr());



}
}