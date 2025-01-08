//variable
class add{
  
 public static void (int... x){
  int sum = 0;
 for(int a: x){
   sum = sum+ a;
  }
 System.out.pritln("sum is : " +sum);
}

public static void main(String... args){


  add();
  add(10);
  add(1,2);
  add(1,2,3,3);
 }

}