//explain method overriding in java programing ?

class parent{
   public void show(){
   System.out.println(" This is parent class show method ....");
   }
}

class child extends parent{
   public void show(){
   System.out.println(" This is child class show method ....");
   }


   public static void main(String args[]){
    parent c= new child();
     c.show();
   }
}