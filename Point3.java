// use of this for call instance class 
// use of inheritance

class Point3{
public int x;
public int y;//instance variable
public Point3(){
System.out.println("Point3 class Default Constructor is called");

}
public Point3(int x,int y){
this.x=x;
this.y=y;
System.out.printf("x=%d Y=%d ",x,y);
System.out.println("Point3 class Parameterized Constructor is called");
}
void showData(){
System.out.println("X_CO : "+x);
System.out.println("Y_CO : "+y);
}
public static void main(String args[]){
System.out.println("Point3 class Main Method");
Point3 p2=new Point3(10,20);
p2.showData();
}
}
class Circle extends Point3{


}