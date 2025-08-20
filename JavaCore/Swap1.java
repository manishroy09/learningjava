class Swap1{
    public static void main(String args[]){
    int a, b, c;
     a = 7;
     b = 5;
     System.out.println("Before Swapping : ");
     System.out.printf("A = %d   B = %d " , a, b);

     c = a;
     a = b;
     b = c;
    
     System.out.println("After Swapping : ");
     System.out.printf("A = %d   B = %d " , a, b);
    }
}