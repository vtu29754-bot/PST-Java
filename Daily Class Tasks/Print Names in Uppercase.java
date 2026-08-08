import java.util.Arrays;
import java.util.List;

public class PrintNamesUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "alice", "bob", "marry");

        System.out.println("Input: " + names);
        System.out.println("Output:");

        names.stream()
             .filter(name -> name != null && !name.isEmpty())
             .map(String::toUpperCase)
             .forEach(System::println);
    }
}

/*
INPUT & OUTPUT:

Input: [john, alice, bob, marry]
Output:
JOHN
ALICE
BOB
MARRY
*/
