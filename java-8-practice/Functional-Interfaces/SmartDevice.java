interface Device {
    void turnOn();
    void turnOff();
}

class Light implements Device {
    public void turnOn() {}
    public void turnOff() {}
}

class AC implements Device {
    public void turnOn() {}
    public void turnOff() {}
}

class TV implements Device {
    public void turnOn() {}
    public void turnOff() {}
}

public class SmartDevice {
    public static void main(String[] args) {
        Device light = new Light();
        Device ac = new AC();
        Device tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
