interface VehicleDashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery: 100%");
    }
}

class Car implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Car speed: 60 km/h");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Electric Car speed: 50 km/h");
    }

    public void displayBattery() {
        System.out.println("Electric Car battery: 80%");
    }
}

public class VehicleDashboards {
    public static void main(String[] args) {
        VehicleDashboard car = new Car();
        VehicleDashboard eCar = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
