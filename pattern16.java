// cw
//to print pattern  alternate of pattern having space
class pattern16{
     public static void main(String args []){

     int r,c; 
     int n=0;
     for(r=1;r<=5;r++){
            for(int i=5; i>r; i--){
 
              System.out.print( " ");
               }

           for(c=1;c<=r;c++){
             n++; 
            System.out.print((char)(64+n));
               
             }
          
           System.out.println(" ");
         }
    }
  }