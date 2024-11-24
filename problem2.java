 import java.util.Scanner;
  public class problem2{
            public static void main(String args[]){
            
            float r,ar,cr;
            Scanner M=new Scanner(System.in);
   

          System.out.println(" Enter Radius : ");
           r=M.nextFloat();
 
         ar=3.14f*r*r;
         cr=2*3.14f*r;
        System.out.println(" Area of circle : " +ar);
        System.out.println(" circumference of circle :" +cr);


  

}
}