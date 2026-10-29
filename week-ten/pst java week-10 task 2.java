import java.util.Arrays;

class DynamicArray {
    private int[] data;
    private int size;
    private int capacity;

    public DynamicArray() {
        this.capacity = 2;
        this.data = new int[capacity];
        this.size = 0;
    }

    public void add(int mark) {
        if (size == capacity) {
            resize();
        }
        data[size++] = mark;
    }

    private void resize() {
        capacity *= 2;
        data = Arrays.copyOf(data, capacity);
        System.out.println("[Array resized to capacity: " + capacity + "]");
    }

    public void display() {
        System.out.print("Student Marks: [");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}

class PST_Java_Week10_Task2 {
    public static void main(String[] args) {
        DynamicArray marks = new DynamicArray();
        marks.add(85);
        marks.add(90);
        marks.add(78); // triggers resize to 4
        marks.add(92);
        marks.add(88); // triggers resize to 8
        marks.display();
    }
}

/*
INPUT & OUTPUT:

INPUT:
Sequential Marks: 85, 90, 78, 92, 88

OUTPUT:
[Array resized to capacity: 4]
[Array resized to capacity: 8]
Student Marks: [85, 90, 78, 92, 88]
*/
