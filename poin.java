// inheritance 

class poin{
public int x;
public int y;

 public poin(){
     System.out.println("point class default constructor is called ");
}

public poin( int x, int y){
 this.x=x;
 this.y=y;
System.out.println("point class parametrized is called");
 }




public static void main(String args[]){
 poin p1=new poin();
 poin p2=new poin(10,20);
 

}

}

class circlein extends poin{
  public static void main (String args[]){

  System.out.println(" this is child class call ");

}



}



 