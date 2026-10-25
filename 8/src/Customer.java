public class Customer implements Runnable{
    Bar bar;
    String customerName;

    public Customer(Bar bar, String customerName) {
        this.bar = bar;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        int drink=0;
        while(drink<10){
            try {
                bar.take(customerName);
                drink++;
                Thread.sleep(30);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(customerName+"喝完10杯奶茶,离开");
    }
}
