// static variable 
class point6 {
 int x;
 int y; 
 static int count;
 
 public point6(){
   count++;
  }

public static void main(String args[]){
  
point6 p1= new point6();
point6 p2= new point6();
point6 p3= new point6();
point6 p4= new point6();
point6 p5= new point6();

System.out.println(p1.count);
System.out.println("Number of Object is created :"+count );
System.out.println("Number of Object is created :" +point6.count);

}
}