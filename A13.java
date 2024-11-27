// to find second largest element of array
class A13{
     public static void main(String args[]){
     int arr[]={100,1,200,2,300,0,-1};
     int max1=arr[0];
     int max2=arr[0];

   for(int i=0; i<arr.length; i++){
      if(arr[i]>max1){
        max1=arr[i];
        }
      }
  for( int i=0; i<arr.length; i++){
    if(arr[i]>max2 && arr[i]!=max1){
       max2=arr[i];
      }
    }
    System.out.print( "Second Largest Element : " +max2);
           

}
}




 