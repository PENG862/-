import java.util.List;

public class Order implements Comparable<Order>{
    String orderId;
    String name;
    double price;
    List<String> goodTag;

    public Order(String orderId, String name, double price, List<String> goodTag) {
        this.orderId = orderId;
        this.name = name;
        this.price = price;
        this.goodTag = goodTag;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getGoodTag() {
        return goodTag;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", goodTag=" + goodTag +
                '}';
    }

    @Override
    public int compareTo(Order o) {
        if (price != o.price) {
            return Double.compare(o.price, this.price);
        }
        else {
            return this.orderId.compareTo(o.orderId);
        }

    }
}
