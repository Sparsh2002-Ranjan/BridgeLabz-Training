class Prototype implements Cloneable {
    String name;

    Prototype(String name) {
        this.name = name;
    }

    public Prototype cloneObject() {
        try {
            return (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

public class Clone {
    public static void main(String[] args) {
        Prototype original = new Prototype("OriginalObject");
        Prototype copy = original.cloneObject();

        System.out.println("Original name: " + original.name);
        System.out.println("Cloned name: " + (copy != null ? copy.name : "Clone failed"));
    }
}
