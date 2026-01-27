
@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON with full brightness");
        LightAction night = () -> System.out.println("Lights ON with dim mode");
        LightAction voice = () -> System.out.println("Lights ON with custom color");

        motion.activate();
        night.activate();
        voice.activate();
    }
}
