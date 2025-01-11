class NegativeException extends Throwable{
 public String msg;
public NegativeException(String msg){
  this.msg=msg;
  }

public String getMsg(){
 return msg;
 }
}