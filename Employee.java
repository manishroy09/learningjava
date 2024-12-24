// write a java program to crate a employ class and perform operation 
// creat a student class and print data of student
import java.util.Scanner;
class Employee{
    String name;
    
    int empno;
    float sal;
       
   void getData(){
       Scanner sk=new Scanner (System.in);
     System.out.println("Enter name of Employee:");
     name=sk.nextLine();
     

     System.out.println("Enter Employee number : ");
     empno=sk.nextInt();
     System.out.println("Enter salary  :");
     sal=sk.nextFloat();
     


}

  void showData(){
     System.out.println(" Name of Employee :" +name);
     System.out.println(" Employee number :" +empno);
     System.out.println(" Salary of Employee :" +sal);
         }
      
    double getHRA(){  
          
      return (sal*0.25);
     
    
    }
  
  double getDA(){
          
          return (sal*0.5);
    
    }
    double getTA(){
          
           return (sal*0.2);
    
    }
   double grossSalary(){
          
           return (sal+sal*0.25+sal*0.5+sal*0.2);
    
    }

  double getTotalIncentive(){
          
           return (sal*0.25+sal*0.5+sal*0.2);

    
    }




public static void main(String args[]){
   Employee e=new Employee();

 e.getData();
 e.showData();
System.out.println( "HRA :" +e.getHRA());
 
System.out.println( " DA:" +e.getDA());

System.out.println( "TA :" +e.getTA());

System.out.println( "gross Salary :" +e.grossSalary());

System.out.println( "Total Incentive :" +e.getTotalIncentive());

 





}
}

