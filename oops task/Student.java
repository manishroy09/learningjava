public class Student{
 String name;
 int roll_no;

void display(){
 System.out.println("Name is : " +name );
 System.out.println(" roll no is : " +roll_no);
}

public static void main(String args[]){
Student s = new Student();
s.name = "John";
s.roll_no = 2;
 s.display();
}

}

 