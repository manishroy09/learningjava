// this is used to call current class constructor 

class Point4{
public int x;
public int y;//instance variable
public Point4(){
System.out.println("Point4 class Default Constructor is called");
}
public Point4(int x,int y){
this();//to call current class default constructor
this.x=x;
this.y=y;
System.out.printf("\nx=%d Y=%d ",x,y);
System.out.println("Point4 class Parameterized Constructor is called");
}
void showData(){
System.out.println("X_CO : "+x);
System.out.println("Y_CO : "+y);
}
void hi(){
System.out.println("Hi... Method is Called");
this.showData();
int x=111;
int y=222;
System.out.printf("\nx=%d Y=%d ",this.x,this.y);
}
public static void main(String args[]){
System.out.println("Point4 class Main Method");
Point4 p2=new Point4(10,20);
p2.hi();
}
}
class Circle extends Point4{

}