import java.util.*;

class BankingTransactionSystem {
    static class BankAccount {
        private int balance = 0;

        void deposit(int amount) {
            balance += amount;
        }

        void withdraw(int amount) {
            balance -= amount;
        }

        int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        BankAccount account = new BankAccount();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            int amount = Integer.parseInt(parts[1]);

            if (parts[0].equalsIgnoreCase("Deposit")) {
                account.deposit(amount);
            } else if (parts[0].equalsIgnoreCase("Withdraw")) {
                account.withdraw(amount);
            }
        }

        System.out.println(account.getBalance());
    }
}

/*
# Input:
# 4
# Deposit 1000
# Deposit 500
# Withdraw 200
# Withdraw 100

# Output:
# 1200
*/
