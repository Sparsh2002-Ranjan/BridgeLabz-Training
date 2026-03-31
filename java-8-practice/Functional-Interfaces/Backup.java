import java.io.Serializable;

class UserData implements Serializable {
    String name;
    int age;

    UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Backup {
    public static void main(String[] args) {
        UserData user = new UserData("Alice", 25);

        if (user instanceof Serializable) {
            System.out.println(user.name + " is serializable for backup.");
        } else {
            System.out.println(user.name + " is NOT serializable.");
        }
    }
}
