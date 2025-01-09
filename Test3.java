// one interface can extends more than one interface
// that is multiple inheritance 

// multiple inheritance

interface IA{
   void a();
}
interface IB{
   void b();
}
interface IC extends IA,IB{
     void c();
 }

 
 class Test3 implements IC{
  public void a(){
   System.out.println("This is IA interface a method");
}
public void b(){
   System.out.println("This is IB interface b method");
}
public void c(){
   System.out.println("This is IB interface c method");
}


  public void hello(){
   System.out.println("This is Test class hello method");
}
public static void main(String args[]){
// IA obj = new IA();
// IA obj = new Test3();
  IA obj = new Test3();
  obj.a();
// obj.hello();
Test3 t = new Test3();
 t.a();
 t.hello();
t.b();
t.c();
}
}