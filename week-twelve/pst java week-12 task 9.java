import java.util.HashMap;
import java.util.Map;

class StudentRecord {
    int id;
    String name;
    double marks;

    StudentRecord(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + marks;
    }
}

class PST_Java_Week12_Task9 {
    public static void main(String[] args) {
        Map<Integer, StudentRecord> index = new HashMap<>();
        index.put(1001, new StudentRecord(1001, "Aravind", 92.5));
        index.put(1002, new StudentRecord(1002, "Bhavna", 88.0));
        index.put(1003, new StudentRecord(1003, "Chetan", 79.5));

        int[] queries = {1002, 1004, 1001};
        for (int q : queries) {
            if (index.containsKey(q)) {
                System.out.println("Query ID " + q + " -> " + index.get(q));
            } else {
                System.out.println("Query ID " + q + " -> Record Not Found");
            }
        }
    }
}

/*
INPUT & OUTPUT:

INPUT:
Stored records: 1001 (Aravind, 92.5), 1002 (Bhavna, 88.0), 1003 (Chetan, 79.5)
Queries: 1002, 1004, 1001

OUTPUT:
Query ID 1002 -> Name: Bhavna, Marks: 88.0
Query ID 1004 -> Record Not Found
Query ID 1001 -> Name: Aravind, Marks: 92.5
*/
