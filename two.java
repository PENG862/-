public class two {
    public static  void main (String[] args){
        String name="机械键盘";
        double price=150.0;
        boolean underprice=false;
        boolean baoYou=false;
        int number=2;
        double pay=0;
        pay=price*number;
        if (pay>=100.0 || underprice){
            baoYou=true;}
        System.out.println("商品："+name+","+"单价"+","+price+"元" +","+"促销中:"+underprice+","+"购买"+number+"件"+","+"总价为："+pay+"元");
        System.out.println("是否享受包邮："+baoYou);
        int a=10,b=20;
        System.out.println("交换前：a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("交换后：a="+a+",b="+b);

    }
}
