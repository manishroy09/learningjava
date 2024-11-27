//write a program to print largest and smallest element of array using shorting
class A17{
   public static void main(String args[]){

   int arr[]={30,10,20,50,40,100,90,60,80,70};

   System.out.println("Before sorting ");
   for(int i=0; i<arr.length ; i++){
   System.out.print("\t" +arr[i]);
   }
// bubble short logic 


  for(int i=0; i<arr.length; i++){
       for(int j=i+1; j<arr.length; j++){
            if(arr[i]<arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           }
       }
   }
System.out.println("\nAfter Sorting");
for(int i=0;i<arr.length;i++){
System.out.print("\t" +arr[i]  );
}

System.out.println("\nLargest Element :" +arr[0]);
System.out.println( "Smallest Element :" +arr[arr.length-1]);

System.out.println("Second Largest Element :" +arr[1]);
System.out.println( "Second Smallest Element :" +arr[arr.length-2]);


}
}