class Sb3{
    public static void main(String args[]){
    StringBuffer sb1=new StringBuffer();
    sb1.append("Hello");
     sb1.insert(0," Value of PI : ");
      sb1.insert(0,"3.14");
       sb1.insert(0," this is");
        sb1.insert(0," true");
    System.out.println(sb1);

    StringBuffer sb2=new StringBuffer("welcome bhopal");                                 
    System.out.println(sb2);
    sb2.insert(8,"to ");
    System.out.println(sb2);

 
    }
}