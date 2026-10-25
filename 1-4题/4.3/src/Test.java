public class Test {
    public void main(){
        Product p1 =new Product("机械硬盘");
        StorageBox<Product> s1 =new StorageBox<>();
        s1.storeItem(p1);
        String id=s1.retrieveItem().getName();
        System.out.println("商品储物箱存取测试: 成功取出商品 -> "+id);
        TransportVehicle t1=new TransportVehicle("无人机 [D-007]");
        StorageBox<TransportVehicle> s2=new StorageBox<>();
        s2.storeItem(t1);
        String id2=s2.retrieveItem().getName();
        System.out.println("设备储物箱存取测试: 成功取出设备 -> "+id2);

    }
}
