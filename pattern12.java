//to print pattern
class pattern12{
     public static void main(String args []){

     int r,c; 
     int n=0;

     for(r=1;r<=5;r++){
           for(c=1;c<=r;c++){
              n++;
                   System.out.print((char)(64+n));// called type casting
                }
           System.out.println(" ");
         }
    }
  }