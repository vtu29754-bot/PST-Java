import java.util.*;

class Item {
    String id;
    String name;
    int stock;
    double price;

    Item(String id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | Stock: " + stock + " | Price: $" + price;
    }
}

class PST_Java_Week12_Task10 {
    private Map<String, Item> inventory = new HashMap<>();

    public void addProduct(Item item) {
        inventory.put(item.id, item);
    }

    public void recordSale(String id, int quantity) {
        Item item = inventory.get(id);
        if (item != null) {
            item.stock = Math.max(0, item.stock - quantity);
            System.out.println("Sold " + quantity + " of " + item.name + ". Remaining: " + item.stock);
        }
    }

    public void printLowStock(int threshold) {
        System.out.println("\n--- Low Stock Products (Stock < " + threshold + ") ---");
        for (Item item : inventory.values()) {
            if (item.stock < threshold) {
                System.out.println(item);
            }
        }
    }

    public void displaySortedByStock() {
        System.out.println("\n--- Products Sorted by Remaining Stock ---");
        List<Item> list = new ArrayList<>(inventory.values());
        list.sort(Comparator.comparingInt(a -> a.stock));
        for (Item item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        PST_Java_Week12_Task10 store = new PST_Java_Week12_Task10();
        store.addProduct(new Item("P101", "Cereal", 15, 3.99));
        store.addProduct(new Item("P102", "Almond Milk", 4, 2.49));
        store.addProduct(new Item("P103", "Apples", 25, 0.99));

        // 1. Update stock after sale
        store.recordSale("P101", 12);

        // 2. Find low stock
        store.printLowStock(5);

        // 3. Display sorted by stock
        store.displaySortedByStock();
    }
}

/*
INPUT & OUTPUT:

INPUT:
Products:
P101 (Cereal, Stock: 15)
P102 (Almond Milk, Stock: 4)
P103 (Apples, Stock: 25)

Action: Sell 12 of P101
Low stock threshold: 5

OUTPUT:
Sold 12 of Cereal. Remaining: 3

--- Low Stock Products (Stock < 5) ---
P101 | Cereal | Stock: 3 | Price: $3.99
P102 | Almond Milk | Stock: 4 | Price: $2.49

--- Products Sorted by Remaining Stock ---
P101 | Cereal | Stock: 3 | Price: $3.99
P102 | Almond Milk | Stock: 4 | Price: $2.49
P103 | Apples | Stock: 25 | Price: $0.99
*/
