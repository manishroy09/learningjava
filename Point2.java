// encapsulation
//

class Point2{
 private int x;
 private int y;
//member data

public int getx(){
   return x;
  }
public void setx(int x){
  this.x=x;
}

public int gety(){
   return y;
  }
public void sety(int y){
  this.y=y;
}



 public Point2(){
  x=1;
  y=1;
 System.out.println("Default Constructor is called ");
}

public Point2(int a, int b){// perametrized constructor
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
 Point2 p1=new Point2();
 p1.setx(11);
 p1.sety(22);
 System.out.println("X_CO :"+p1.getx());
 System.out.println("Y_CO :"+p1.gety());
 


}
}

