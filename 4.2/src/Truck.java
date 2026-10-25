public class Truck extends TransportVehicle implements GPSLocatable{
    public Truck(String name, String vehicleId) {
        super(name, vehicleId);
        super.name=name;
        this.truckPrice = truckPrice;
    }

    double truckPrice;
    @Override
    public String getLocation() {
        System.out.print("当前位置:仓库A区");
        return "";
    }

    @Override
    public double calculateCost(double weight) {
        truckPrice=weight*5;

        return truckPrice;
    }
}
