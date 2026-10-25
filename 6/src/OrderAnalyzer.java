import java.util.*;

public class OrderAnalyzer {
    List<Order> orderList = new ArrayList<>();

    @Override
    public String toString() {
        return "orderList=" + orderList +
                '}';
    }

    //task 1
    public void add(Order o1){
        orderList.add(o1);
    }
    //task 2
    public void removeInvalidOrders(){
        Iterator<Order> it = orderList.iterator();
        while (it.hasNext()){
            if (it.next().price<=0) {
                it.remove();;
            }
        }
    }
    //task 3
    public Set<String> getAllUniqueTags(){
        Set<String> tagSet = new HashSet<>();
        for(Order order : orderList){
             for(String tag : order.goodTag){
                   tagSet.add(tag);
             }
        }
        return tagSet;
    }
    //task 4
    public Map<String,Double> getCustomerSpendMap(){
        Map<String,Double> mapList = new HashMap<>();
        for (Order order : orderList ){
            String name = order.name;
            double price =order.price;
            if (mapList.containsKey(name)){
                double beforePrice = mapList.get(name);
                mapList.put(name,beforePrice+price);
            }
            else{
                mapList.put(name,price);
            }
        }
        return mapList;
    }
    //task 5
    public List<Order> sortOrdersByCustomerName(){
        List<Order> newList = new ArrayList<>(orderList);
        Collections.sort(newList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        return newList;
    }

}

