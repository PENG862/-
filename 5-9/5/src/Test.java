public class Test {
    public void main(){
        try {
            Serve s1=new Serve(-100.0,"Num1");
            s1.method(s1.price,s1.transactionId);
        }
        catch (Exception e){
            e.getStackTrace();
        }
        try {
            Serve s2=new Serve(20000.0,"Num2");
            s2.method(s2.price,s2.transactionId);
        }
        catch (Exception e){
            e.getStackTrace();
        }
        try {
            Serve s3=new Serve(500.0,"Num3");
            s3.method(s3.price,s3.transactionId);
        }
        catch (Exception e){
            e.getStackTrace();
        }
        try {
        Serve s4 =new Serve(1000.0,"Num4");
        s4.method(s4.price,s4.transactionId);}
        catch (Exception e){
            e.getStackTrace();
        }
    }
}
