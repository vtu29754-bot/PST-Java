public class JavaInheritance2 {
    static class Arithmetic {
        public int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {}

    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.println(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10));
    }
}

/*
INPUT & OUTPUT:

My superclass is: JavaInheritance2$Arithmetic
42 13 20
*/
