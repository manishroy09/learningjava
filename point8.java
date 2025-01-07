// static block
class point8 {
 int x;
 int y; 
 static int count;

static{
 count = 100;
System.out.println("This is static block 1 here");
}
 
 public point8(){
   count++;
  }
public static int getctr(){
   return count;
 }
static{
 count = 300;
System.out.println("This is static block 3 here");
}


public static void main(String args[]){
  
point8 p1= new point8();
point8 p2= new point8();
point8 p3= new point8();
point8 p4= new point8();
point8 p5= new point8();

System.out.println(p1.count);
System.out.println("Number of Object is created :"+count );
System.out.println("Number of Object is created :" +point8.count);
System.out.println("======= static method is called =========" );
System.out.println("Number of Object is created :" +p1.getctr());
System.out.println("Number of Object is created :"+getctr() );
System.out.println("Number of Object is created :" +point8.getctr());



}
static{
 count = 200;
System.out.println("This is static block 2 here");
}

}