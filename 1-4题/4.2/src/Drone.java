public class Drone extends TransportVehicle implements GPSLocatable{
    public Drone(String name, String vehicleId) {
        super(name, vehicleId);
        super.name=name;
        this.dronePrice = dronePrice;
    }

    double dronePrice;
    @Override
    public String getLocation() {
        System.out.print("当前位置:高空坐标(39.9,116.4)");
        return "";
    }

    @Override
    public double calculateCost(double weight) {
        dronePrice=weight*15;
        return dronePrice;
    }
}
