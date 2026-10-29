import java.util.*;

class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            try {
                int x = sc.nextInt();
                int y = sc.nextInt();

                System.out.println(x / y);

            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e.getMessage());

            } catch (InputMismatchException e) {
                System.out.println("Exception caught: " + e);
                sc.next();
            }
        }
    }
}

/*
# Input:
# 10 2
# 20 0
# 15 3

# Output:
# 5
# Exception caught: / by zero
# 5
*/
