import java.util.ArrayList;
import java.util.List;

public class Test {
    public void main(){
        List<String> l1 = new ArrayList<>();
        l1.add("电子");
        l1.add("数码");
        Order o1 = new Order("O001","Alice",150.0,l1);
        List<String> l2 = new ArrayList<>();
        l2.add("服装");
        Order o2 = new Order("O002","Bob",-50.0, l2);
        List<String> l3 = new ArrayList<>();
        l3.add("图书");
        l3.add("电子");
        Order o3 = new Order("O003","Alice",200.0, l3);
        List<String> l4 = new ArrayList<>();
        l4.add("生鲜");
        Order o4 = new Order("O004","Charlie",200.0, l4);
        List<String> l5 = new ArrayList<>();
        l5.add("服装");
        l5.add("户外");
        Order o5 = new Order("O005","Bob",300.0, l5);
        OrderAnalyzer  orderList = new OrderAnalyzer();
        orderList.add(o1);
        orderList.add(o2);
        orderList.add(o3);
        orderList.add(o4);
        orderList.add(o5);
        orderList.removeInvalidOrders();
        System.out.println(orderList.getAllUniqueTags());
        System.out.println(orderList.getCustomerSpendMap());
        System.out.println(orderList.sortOrdersByCustomerName());
        System.out.println(orderList);
    }
}
