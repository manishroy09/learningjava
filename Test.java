// interface 

interface IA{
   void a();
}
 
class Test implements IA{
  public void a(){
   System.out.println("This is IA interface a method");
}
  public void hello(){
   System.out.println("This is Test class hello method");
}
public static void main(String args[]){
// IA obj = new IA();
// IA obj = new Test();
  IA obj = new Test();
  obj.a();
// obj.hello();
Test t = new Test();
 t.a();
 t.hello();
}
}