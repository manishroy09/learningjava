//to print pattern
class pattern10{
     public static void main(String args []){

     int r,c; 
     

     for(r=1;r<=5;r++){
           for(c=1;c<=r;c++){

                   System.out.print((char)(64+r));
                }
           System.out.println(" ");
         }
    }
  }