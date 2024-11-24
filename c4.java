// task 
import java.util.Scanner;
    public class c4{
       public static void main(String args[]){
        
      int m,y,d;
      String n;
      Scanner g=new Scanner(System.in);

    System.out.println("Enter month ");
    m=g.nextInt();
    System.out.println("Enter year ");
    y=g.nextInt();
  
     switch(m){
         case 1:
            n="january" ;
            d=31;
            break;

          case 2:
            n= "February" ;
           if(y%4==0){
               d=29;
               }
           else{
              d=28;
             }
            break;
            
          case 3:
            n= "March" ;
            d=31;
           break;

          case 4:
            n="Aril" ;
            d=30;
            break;
          case 5:
           n="May" ;
           d=31;
            break;
          case 6:
            n="June";
            d=30;
            break;
          case 7:
            n="July" ;
            d=31;
            break;
          case 8:
            n="August" ;
            d=31;
            break;
          case 9:
            n="Septemper" ;
            d=30;
            break;
         case 10:
            n="October" ;
            d=31;
            break;
          case 11:
            n="November" ;
            d=30;
            break;
          case 12:
            n="December"; 
            d=31;
            break;    
          default:
           n="invalid";
           d=0;
           System.out.println(" Invalid month and year");  
        }
                   System.out.println( n+ " " +y+ " has " +d+ " days ");
       
        }
}