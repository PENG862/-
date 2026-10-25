public class Test3 {
    public void main(){
        LogisticsOrder order = new LogisticsOrder.Builder()
                .setOrderId("OD-999")
                .setSendPerson("Alice")
                .setReceivePerson("Bob")
                .setBreakable(true)
                .setPrice(1000.0)
                .build();

        System.out.println("运单生成：订单号[" + order.orderId + "]，寄件人[" + order.sendPerson
                + "]，收件人[" + order.receivePerson + "]，易碎品[" + order.breakable
                + "]，保价[" + order.price + "元]");
    }
}
