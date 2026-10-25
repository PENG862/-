public class Serve {
    double price;
    String transactionId;

    public Serve(double price, String transactionId) {
        this.price = price;
        this.transactionId = transactionId;
    }

    public boolean method(double price, String transactionId){
        PaymentProcessor p1=new PaymentProcessor();
        try {
                p1.PayMethod (price, transactionId);
        }
         catch (InsufficientFundsException e){
             System.out.println("余额不足，流水号为["+transactionId+']');
             return false;
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            throw new SystemMaintenanceException("系统维护中，请稍后再试", e);
        }
        catch (Exception e){
            System.out.println("发生未知异常:"+e.getMessage());
            return false;
        }
        finally {
            System.out.println("执行资源清理任务...");

        }
        return true;


    }
}
