public class JavaGenerics {
    static class Printer {
        public <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        System.out.println("Printing Integer Array:");
        myPrinter.printArray(intArray);
        System.out.println("Printing String Array:");
        myPrinter.printArray(stringArray);
    }
}

/*
INPUT & OUTPUT:

Printing Integer Array:
1
2
3
Printing String Array:
Hello
World
*/
