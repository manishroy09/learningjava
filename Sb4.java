 class Sb4{
     public static void main(String args[]){
        StringBuffer sb1=new StringBuffer("welcome");
        System.out.println(sb1);
        sb1.deleteCharAt(sb1.length()/2);
        sb1.deleteCharAt(0);
        sb1.deleteCharAt(sb1.length()-1);
        System.out.println(sb1.toString());

}
}
 