import java.util.*;

class Node {
    String SenderName;
    String SenderLocation;
    String ReciverLocation;
    String CurrentLocation;
    String Status;
    String Time;
    Node next;

    public Node(String SenderName, String SenderLocation, String ReciverLocation,
                String CurrentLocation, String Status, String Time) {
        this.SenderName = SenderName;
        this.SenderLocation = SenderLocation;
        this.ReciverLocation = ReciverLocation;
        this.CurrentLocation = CurrentLocation;
        this.Status = Status;
        this.Time = Time;
        this.next = null;
    }
}

class List {
    Node head;

    public void add(Node nn) {
        if (head == null) {
            head = nn;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
    }

    public void display() {
        if (head == null) {
            System.out.println("No Parcel Found");
            return;
        }
        Node temp1 = head;
        int a=0;
        while (temp1 != null) {
            System.out.println("Displaying checkpoint "+ a +
                               "\n           SenderName -> " + temp1.SenderName +
                               "\n           SenderLocation -> " + temp1.SenderLocation +
                               "\n           ReciverLocation -> " + temp1.ReciverLocation +
                               "\n           CurrentLocation -> " + temp1.CurrentLocation +
                               "\n           Status -> " + temp1.Status +
                               "\n           Time -> " + temp1.Time);
            a++;
            temp1 = temp1.next;
        }
    }

    public void checkMissing() {
        if (head == null) {
            System.out.println("No Parcel available.");
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        if (!temp.Status.equalsIgnoreCase("Delivered")) {
            System.out.println("Parcel is missing after checkpoint CurrentLocation -> " + temp.CurrentLocation);
        } else {
            System.out.println("Parcel tracking is complete. Delivered successfully.");
        }
    }
}

public class ParcelTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;

        while (b) {

            System.out.println("Enter a Number");
            System.out.println("1. to add a new parcel");
            System.out.println("2. to exit");
            int value = sc.nextInt();
            sc.nextLine();

            switch (value) {
                case 1:
                    List list = new List();

                    System.out.println("Write Sender Name");
                    String sname = sc.nextLine();

                    System.out.println("Write Sender Address");
                    String sadd = sc.nextLine();

                    System.out.println("Write Reciver Address");
                    String radd = sc.nextLine();

                    boolean bb = true;
                    while (bb) {
                        System.out.println();
                        System.out.println("Enter a Number");
                        System.out.println("1. continue to add new checkpoint for the parcel");
                        System.out.println("2. to display current checkpoint crossed by parcel");
                        System.out.println("3. to check current parcel is missing or not");
                        System.out.println("4. to exit and make a new parcel");
                        int n = sc.nextInt();
                        sc.nextLine();

                        switch (n) {
                            case 1:
                                System.out.println("Write current packet location");
                                String loc = sc.nextLine();

                                System.out.println("Write Status if its the last checkpoint please write Delivered otherwise write Passed");
                                String st = sc.nextLine();

                                System.out.println("Write time");
                                String tim = sc.nextLine();

                                list.add(new Node(sname, sadd, radd, loc, st, tim));

                                if (st.equalsIgnoreCase("Delivered")) {
                                    list.display();
                                    bb = false;
                                }
                                break;

                            case 2:
                                list.display();
                                break;

                            case 3:
                                list.checkMissing();
                                break;

                            case 4:
                                bb = false;
                                break;

                            default :
                                System.out.print("Invalid Input");
                                break;
                        }
                    }
                    break;

                case 2:
                    b = false;
                    break;

                default :
                    System.out.print("Invalid Input");
                    break;
            }
        }
    }
}
