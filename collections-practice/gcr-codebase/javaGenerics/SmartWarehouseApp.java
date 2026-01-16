import java.util.*;

abstract class WarehouseItem {
    private final String id;
    private final String name;

    protected WarehouseItem(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return id + " - " + name + " (" + getCategory() + ")";
    }
}

class Electronics extends WarehouseItem {
    public Electronics(String id, String name) {
        super(id, name);
    }

    public String getCategory() {
        return "Electronics";
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String id, String name) {
        super(id, name);
    }

    public String getCategory() {
        return "Groceries";
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String id, String name) {
        super(id, name);
    }

    public String getCategory() {
        return "Furniture";
    }
}

class Storage<T extends WarehouseItem> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class WarehouseUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

public class SmartWarehouseApp {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("E101", "Laptop"));
        groceriesStorage.addItem(new Groceries("G201", "Rice Bag"));
        furnitureStorage.addItem(new Furniture("F301", "Office Chair"));

        WarehouseUtil.displayItems(electronicsStorage.getItems());
        WarehouseUtil.displayItems(groceriesStorage.getItems());
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}
