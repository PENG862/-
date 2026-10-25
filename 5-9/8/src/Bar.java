public class Bar {
    int cnt = 0;
    public synchronized void put(String workName) throws InterruptedException {
        while (cnt==5){
            this.wait();
        }
        cnt++;
        System.out.println(workName+"制作了[奶茶]，吧台当前数量:"+cnt);
        this.notifyAll();
    }
    public synchronized void take(String customerName) throws InterruptedException {
        while (cnt==0){
            this.wait();
        }
        cnt--;
        System.out.println(customerName+"取走了[奶茶]，吧台剩余数量:"+cnt);
        this.notifyAll();
    }

}
