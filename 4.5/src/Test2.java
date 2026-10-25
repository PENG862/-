public class Test2 {
    public void main(){
        VehicleFactory.createVehicle("Truck");
        TransportVehicle v1=VehicleFactory.createVehicle("Trunk");
        if (v1!= null) {
            double price =v1.calculateCost(10);
        }

    }
}
