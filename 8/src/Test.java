public class Test {
    public void main(){
        Bar bar =new Bar();
        Runnable staff1 = new Staff(bar, "店员1");
        Runnable staff2 = new Staff(bar, "店员2");
        Runnable customer1 = new Customer(bar, "顾客1");
        Runnable customer2 = new Customer(bar, "顾客2");
        new Thread(staff1).start();
        new Thread(staff2).start();
        new Thread(customer1).start();
        new Thread(customer2).start();
    }
}
