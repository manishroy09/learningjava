class s1{
    public static void main(String args[]){
    
      String a=new String();
      System.out.println(a);
     
      String b=new String("cybrom");
      System.out.println(b);
     
      char arr[]={'w','e','l','c','o','m','e'};
      String c=new String(arr);
      System.out.println(c);

      String d=new String(arr,3,4);
      System.out.println(d);
  
      byte b1[]={65,66,67,68,69,70};
      String e=new String(b1,0,3);
      System.out.println(e);

      String f="welcom to bhopal";
      System.out.println(f);
      }
}