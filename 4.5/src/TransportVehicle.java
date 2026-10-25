public abstract class TransportVehicle {
    protected String name;
    protected String vehicleId;

    public TransportVehicle() {
    }

    public TransportVehicle(String name,String vehicleId) {
        this.name=name;
        this.vehicleId = vehicleId;
    }
    public abstract double calculateCost(double weight);


}