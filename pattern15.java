// cw
//to print pattern  alternate of pattern having space
class pattern16{
     public static void main(String args []){

     int r,c; 
     
     for(r=1;r<=5;r++){
            for(int i=5; i>r; i--){
 
              System.out.print( " ");
               }

           for(c=1;c<=r;c++){
             
            System.out.print((char) (64+r));
                
             }
          
           System.out.println(" ");
         }
    }
  }