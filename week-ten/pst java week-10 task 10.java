import java.util.HashMap;
import java.util.Map;

class PST_Java_Week10_Task10 {
    private Map<String, String> contacts = new HashMap<>();

    public void addOrUpdateContact(String name, String phone) {
        contacts.put(name, phone);
        System.out.println("Updated/Added contact: " + name + " -> " + phone);
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Found " + name + ": " + contacts.get(name));
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public static void main(String[] args) {
        PST_Java_Week10_Task10 dir = new PST_Java_Week10_Task10();
        dir.addOrUpdateContact("Alice", "9876543210");
        dir.addOrUpdateContact("Bob", "9123456780");
        dir.searchContact("Alice");
        // Update phone number
        dir.addOrUpdateContact("Alice", "9998887776");
        dir.searchContact("Alice");
    }
}

/*
INPUT & OUTPUT:

INPUT:
Add: ("Alice", "9876543210"), ("Bob", "9123456780")
Search: "Alice"
Update: ("Alice", "9998887776")
Search: "Alice"

OUTPUT:
Updated/Added contact: Alice -> 9876543210
Updated/Added contact: Bob -> 9123456780
Found Alice: 9876543210
Updated/Added contact: Alice -> 9998887776
Found Alice: 9998887776
*/
