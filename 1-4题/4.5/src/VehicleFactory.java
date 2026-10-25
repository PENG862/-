public class VehicleFactory {
    public static TransportVehicle createVehicle(String type){
        if ("Truck".equals(type)) {
            TransportVehicle t1 = new TransportVehicle("卡车","[T-998]") {
                @Override
                public double calculateCost(double weight) {
                    double price =weight*5;
                    return 0;
                }

            };
            System.out.println("工厂调度:工厂成功分配-> "+t1.name+t1.vehicleId+", 计费启动");
            return t1;
        }
        else if ("Drone".equals(type)) {
            TransportVehicle t2 = new TransportVehicle("无人机","[D-007]") {
                @Override
                public double calculateCost(double weight) {
                    double price =weight*15;
                    return 0;
                }

            };
            System.out.println("工厂调度:工厂成功分配-> "+t2.name+t2.vehicleId+", 计费启动");
            return t2;
        }
        else return null;
    }
}
