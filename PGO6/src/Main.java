public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, 15000, 500);
        Truck truck = new Truck("Volvo", "FH16", 2018, 8000, 400, 10);

        System.out.println("Efektywność paliwowa samochodu: " + car.calculateFuelEfficiency() + " mil na galon");
        System.out.println("Efektywność paliwowa ciężarówki: " + truck.calculateFuelEfficiency() + " mil na galon");
    }
}