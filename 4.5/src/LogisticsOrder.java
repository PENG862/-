public class LogisticsOrder {
    String orderId;
    String sendPerson;
    String receivePerson;
    boolean breakable;
    double price;
    static class Builder{
        String orderId;
        String sendPerson;
        String receivePerson;
        boolean breakable;
        double price;

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setSendPerson(String sendPerson) {
            this.sendPerson = sendPerson;
            return this;

        }

        public Builder setReceivePerson(String receivePerson) {
            this.receivePerson = receivePerson;
            return this;
        }

        public Builder setBreakable(boolean breakable) {
            this.breakable = breakable;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }
        public LogisticsOrder build(){
            LogisticsOrder order =new LogisticsOrder();
            order.orderId=orderId;
            order.sendPerson=sendPerson;
            order.receivePerson=receivePerson;
            order.breakable=breakable;
            order.price=price;
            return order;}


    }


}
