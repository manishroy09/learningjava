
// to find second smallest element of array
class A12{
     public static void main(String args[]){
     int arr[]={100,1,200,2,300,0,-1};
     int min1=arr[0];
     int min2=arr[0];

   for(int i=0; i<arr.length; i++){
      if(arr[i]<min1){
        min1=arr[i];
        }
      }
  for( int i=0; i<arr.length; i++){
    if(arr[i]<min2 && arr[i]!=min1){
       min2=arr[i];
      }
    }
    System.out.print( "Second Smallest Element : " +min2);
           

}
}




 