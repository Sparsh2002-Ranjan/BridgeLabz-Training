import java.util.*;
public class Person {

    private String name;
    private int age;
    private String address;
    // Default constructor
    public Person() {   
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }
    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }
    public static void main(String[] args) {
        Person original = new Person();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine(); // consume the newline
        String address = sc.nextLine();
        original.name = name;
        original.age = age;
        original.address = address;
        Person clone = new Person(original);
        System.out.println("Original Person: Name=" + original.name + ", Age=" + original.age + ", Address=" + original.address);
        System.out.println("Cloned Person: Name=" + clone.name + ", Age=" + clone.age + ", Address=" + clone.address);
    }
}
