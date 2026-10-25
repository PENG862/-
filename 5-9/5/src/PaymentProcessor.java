public class PaymentProcessor {
    double price;
    String transactionId;
    public  void PayMethod(double price,String transactionId)throws InsufficientFundsException{
        if(price<0){
            throw new IllegalArgumentException("支付金额不能为负数");
        } else if (price>10000) {
            throw new InsufficientFundsException("余额不足",transactionId);
        } else if (price==500) {
            throw new SystemMaintenanceException("网络连接超时",new NullPointerException());
        }
        else {
            System.out.println("交易["+transactionId+"]支付成功，金额：["+price+']');
        }

    }

}

