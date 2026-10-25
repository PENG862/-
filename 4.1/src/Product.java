public class Product {
    private String number;
    private String name;
    private double price;
    private static int totalProductCount=0;
    public Product(){
    }
    public Product(String number,String name,double price){
        this.number=number;
        this.name=name;
        this.price=price;
        totalProductCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber(){
        return number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public static int getTotalProductCount(){
        return totalProductCount;
    }
}

