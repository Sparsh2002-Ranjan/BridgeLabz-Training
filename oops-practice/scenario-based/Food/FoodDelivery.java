import java.util.*;

class NoAgentAvailableException extends Exception {
    public NoAgentAvailableException() {
        super("No Agent Available to assign the order.");
    }
}

class Order {
    private String customerName;
    private String[] itemOrdered;

    public Order(String customerName, String[] itemOrdered) {
        this.customerName = customerName;
        this.itemOrdered = itemOrdered;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String[] getItemOrdered() {
        return itemOrdered;
    }
}

class Agent {
    private String agentName;
    private Order order;
    private boolean isAvailable = true;

    public Agent(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentName() {
        return agentName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Agent> agents = new ArrayList<>();
        Queue<Order> orderQueue = new LinkedList<>();

        agents.add(new Agent("Agent1"));
        agents.add(new Agent("Agent2"));
        agents.add(new Agent("Agent3"));

        while (true) {
            System.out.println(
                "1.Place Order\n2.Assign Order to Agent\n3.Active Delivery\n4.Cancel Order\n5.Exit"
            );

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer Name:");
                    String customerName = sc.next();

                    System.out.println("Enter number of items:");
                    int n = sc.nextInt();

                    String[] items = new String[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter item " + (i + 1) + ":");
                        items[i] = sc.next();
                    }

                    orderQueue.add(new Order(customerName, items));
                    System.out.println("Order Placed Successfully!");
                    break;

                case 2:
                    int count = 0;
                    System.out.print("Choose Agent:");

                    for (Agent a : agents) {
                        if (a.isAvailable()) {
                            System.out.print(" " + (++count) + "." + a.getAgentName());
                        }
                    }

                    if (count == 0) {
                        try {
                            throw new NoAgentAvailableException();
                        } catch (NoAgentAvailableException e) {
                            System.out.println(e.getMessage());
                            break;
                        }
                    }

                    if (orderQueue.isEmpty()) {
                        System.out.println("No orders to assign.");
                        break;
                    }

                    System.out.println("\nEnter your choice:");
                    int agentChoice = sc.nextInt();

                    if (agentChoice <= 0 || agentChoice > count) {
                        System.out.println("Invalid Choice");
                        break;
                    }

                    Agent selectedAgent = null;
                    count = 0;

                    for (Agent a : agents) {
                        if (a.isAvailable()) {
                            count++;
                            if (count == agentChoice) {
                                selectedAgent = a;
                                break;
                            }
                        }
                    }

                    Order assignedOrder = orderQueue.poll();
                    selectedAgent.setOrder(assignedOrder);
                    selectedAgent.setAvailable(false);

                    System.out.println("Order assigned to " + selectedAgent.getAgentName());
                    break;

                case 3:
                    System.out.println("Active Deliveries:");
                    for (Agent a : agents) {
                        if (!a.isAvailable()) {
                            System.out.println(
                                a.getAgentName() + " delivering order for " +
                                a.getOrder().getCustomerName() + " " +
                                Arrays.toString(a.getOrder().getItemOrdered())
                            );
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter Customer Name to cancel:");
                    String cancelName = sc.next();

                    boolean removed = false;
                    Iterator<Order> it = orderQueue.iterator();

                    while (it.hasNext()) {
                        if (it.next().getCustomerName().equals(cancelName)) {
                            it.remove();
                            removed = true;
                            System.out.println("Order canceled.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("No pending order found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
