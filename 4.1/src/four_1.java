public class four_1 {
    public void main(){
        Product one =new Product("P001","机械硬盘",450.0);
        Product two =new Product("P002","蓝牙耳机",299.0);
        System.out.println("商品信息: ["+one.getNumber()+']'+' '+one.getName()+','+"价格:"+one.getPrice()+"元");
        System.out.println("商品信息: ["+two.getNumber()+']'+' '+two.getName()+','+"价格:"+two.getPrice()+"元");
        int a=Product.getTotalProductCount();
        System.out.println("系统当前共创建了"+a+"个商品实例");
    }
}
