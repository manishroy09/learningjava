// constructor example
//

class Point{
 int x;
 int y;
//member data
 public Point(){
  x=1;
  y=1;
 System.out.println("Default Constructor is called ");
}

public Point(int a, int b){// perametrized constructor
  x=a;
  y=b;
 System.out.println("Perametrized  Constructor is called ");
}


public void showData(){
  System.out.println("X_CO : " +x);
  System.out.println("Y_CO : " +y);
  System.out.println(" ");
}



public static void main(String args[]){
 Point p1=new Point();
 Point p2=new Point();
 Point p3=new Point();
 p1.showData();
 p2.showData();
 p3.showData();

Point p4=new Point(121,131);
 p4.showData();
Point p5=new Point(10,11);
 p5.showData();




}
}

