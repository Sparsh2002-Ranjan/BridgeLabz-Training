interface Vehicle {
    void rent();
    void returnVehicle();
}

class Car implements Vehicle {
    public void rent() {}
    public void returnVehicle() {}
}

class Bike implements Vehicle {
    public void rent() {}
    public void returnVehicle() {}
}

class Bus implements Vehicle {
    public void rent() {}
    public void returnVehicle() {}
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
