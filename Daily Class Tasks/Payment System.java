import java.util.Map;

@FunctionalInterface
interface PaymentStrategy {
    void pay(double amount);
}

public class PaymentSystem {
    public static void main(String[] args) {
        Map<String, PaymentStrategy> paymentMethods = Map.of(
            "CREDIT_CARD", amt -> System.out.println("Payment of $" + amt + " successful via Credit Card."),
            "UPI",         amt -> System.out.println("Payment of $" + amt + " successful via UPI."),
            "NET_BANKING", amt -> System.out.println("Payment of $" + amt + " successful via Net Banking.")
        );

        String selectedMethod = "UPI";
        double amount = 150.00;

        System.out.println("Input: Selected Method = " + selectedMethod + ", Amount = $" + amount);
        System.out.print("Output: ");
        paymentMethods.getOrDefault(selectedMethod, amt -> System.out.println("Invalid Payment Method."))
                      .pay(amount);
    }
}

/*
INPUT & OUTPUT:

Input: Selected Method = UPI, Amount = $150.0
Output: Payment of $150.0 successful via UPI.
*/
