// interface 

interface IA{
   void a();
}
interface IB{
   void b();
}

 
class Test2 implements IA,IB{
  public void a(){
   System.out.println("This is IA interface a method");
}
public void b(){
   System.out.println("This is IB interface b method");
}

  public void hello(){
   System.out.println("This is Test class hello method");
}
public static void main(String args[]){
// IA obj = new IA();
// IA obj = new Test2();
  IA obj = new Test2();
  obj.a();
// obj.hello();
Test2 t = new Test2();
 t.a();
 t.hello();
t.b();
}
}