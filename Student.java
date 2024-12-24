// creat a student class and print data of student
import java.util.Scanner;
class Student{
    String name;
    String enroll;
    int p;
    int c;
    int m;
    int h;
    int e;
   
   void getData(){
       Scanner sk=new Scanner (System.in);
     System.out.println("Enter name of student :");
     name=sk.nextLine();
     System.out.println("Enter Enrollment number :");
     enroll=sk.nextLine();

     System.out.println("Enter Marks of Physics :");
     p=sk.nextInt();
     System.out.println("Enter Marks of Chemistry :");
     c=sk.nextInt();
     System.out.println("Enter Marks of Maths:");
     m=sk.nextInt();
     System.out.println("Enter Marks of Hindi :");
     h=sk.nextInt();
     System.out.println("Enter Marks of english :");
     e=sk.nextInt();
     



}

  void showData(){
     System.out.println(" Name of Student :" +name);
     System.out.println(" Enrollment number :" +enroll);
     System.out.println(" Marks of Physics :" +p);
     System.out.println(" Marks of Chemistry  :" +c);
     System.out.println(" Marks of Maths :" +m);
     System.out.println(" Marks of Hindi :" +h);
    System.out.println(" Marks of English :" +e);
    }
      
   int getTotalMarks(){  
          
     return (p+c+m+h+e);
     
    
    }
  
float getPercentage(int totalmarks ){
          
          return (totalmarks/5f);
    
    }

public static void main(String args[]){
   Student obj=new Student();

 obj.getData();
 obj.showData();
int tm=obj.getTotalMarks();
System.out.println("Total marks :"+tm);
  float p=obj.getPercentage(tm);
System.out.println("Percentage :"+p);
  


}
}

