import java.util.LinkedList;

public class DesignHashSet {
    static class MyHashSet {
        private final int SIZE = 769;
        private LinkedList<Integer>[] buckets;

        @SuppressWarnings("unchecked")
        public MyHashSet() {
            buckets = new LinkedList[SIZE];
            for (int i = 0; i < SIZE; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hash(int key) {
            return key % SIZE;
        }

        public void add(int key) {
            int index = hash(key);
            if (!buckets[index].contains(key)) {
                buckets[index].add(key);
            }
        }

        public void remove(int key) {
            int index = hash(key);
            buckets[index].remove((Integer) key);
        }

        public boolean contains(int key) {
            int index = hash(key);
            return buckets[index].contains(key);
        }
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        System.out.println("contains(1): " + myHashSet.contains(1));
        System.out.println("contains(3): " + myHashSet.contains(3));
        myHashSet.add(2);
        System.out.println("contains(2): " + myHashSet.contains(2));
        myHashSet.remove(2);
        System.out.println("contains(2): " + myHashSet.contains(2));
    }
}

/*
INPUT & OUTPUT:

contains(1): true
contains(3): false
contains(2): true
contains(2): false
*/
