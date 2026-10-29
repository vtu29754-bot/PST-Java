import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

class PST_Java_Week10_Task6 {
    public static void main(String[] args) {
        List<String> purchases = Arrays.asList("Apple", "Milk", "Bread", "Apple", "Butter", "Milk");
        LinkedHashSet<String> uniqueItems = new LinkedHashSet<>(purchases);
        System.out.println("Purchased Stream: " + purchases);
        System.out.println("Unique Items (Order Preserved): " + uniqueItems);
    }
}

/*
INPUT & OUTPUT:

INPUT:
Purchased Stream: ["Apple", "Milk", "Bread", "Apple", "Butter", "Milk"]

OUTPUT:
Purchased Stream: [Apple, Milk, Bread, Apple, Butter, Milk]
Unique Items (Order Preserved): [Apple, Milk, Bread, Butter]
*/
