public class Test {
    public void main(){
        Truck t1 = new Truck("卡车","T-998");
        Drone d1 = new Drone("无人机","D-007");
        result(t1);
        result(d1);

    }
    public static void  result(TransportVehicle t){
        System.out.print(t.name+" ["+t.vehicleId+"] ");
        t.getLocation();
        double price=t.calculateCost(10.0);
        System.out.println(" | 配送10kg货物费用: "+price+"元");
    }
}
