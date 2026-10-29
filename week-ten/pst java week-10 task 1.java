import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Order implements Comparable<Order> {
    int orderId;
    int priority; // Higher value = higher priority
    String customer;

    Order(int orderId, int priority, String customer) {
        this.orderId = orderId;
        this.priority = priority;
        this.customer = customer;
    }

    @Override
    public int compareTo(Order other) {
        return Integer.compare(other.priority, this.priority);
    }
}

class PST_Java_Week10_Task1 {
    public static void main(String[] args) {
        // Fast search by ID: Non-linear collection (HashMap)
        Map<Integer, Product> productCatalog = new HashMap<>();
        productCatalog.put(101, new Product(101, "Laptop", 899.99));
        productCatalog.put(102, new Product(102, "Headphones", 49.99));
        productCatalog.put(103, new Product(103, "Smartphone", 599.99));
        System.out.println("Searching Product 102: " + productCatalog.get(102));

        // Priority order processing: Non-linear collection (PriorityQueue)
        PriorityQueue<Order> orderQueue = new PriorityQueue<>();
        orderQueue.add(new Order(1, 1, "Alice (Regular)"));
        orderQueue.add(new Order(2, 3, "Bob (VIP)"));
        orderQueue.add(new Order(3, 2, "Charlie (Express)"));

        System.out.println("\nProcessing Orders by Priority:");
        while (!orderQueue.isEmpty()) {
            Order o = orderQueue.poll();
            System.out.println("Processing Order #" + o.orderId + " for " + o.customer);
        }
    }
}

/*
INPUT & OUTPUT:

INPUT:
Products: [101: Laptop, $899.99], [102: Headphones, $49.99], [103: Smartphone, $599.99]
Orders: [Order 1: Regular (Pri: 1)], [Order 2: VIP (Pri: 3)], [Order 3: Express (Pri: 2)]

OUTPUT:
Searching Product 102: Headphones ($49.99)

Processing Orders by Priority:
Processing Order #2 for Bob (VIP)
Processing Order #3 for Charlie (Express)
Processing Order #1 for Alice (Regular)
*/
