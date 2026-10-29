import java.util.HashMap;
import java.util.Map;

class PST_Java_Week10_Task9 {
    public static void main(String[] args) {
        Map<Integer, Integer> studentMarks = new HashMap<>();
        studentMarks.put(101, 89);
        studentMarks.put(102, 76);
        studentMarks.put(103, 95);
        studentMarks.put(104, 84);

        int queryRollNo = 103;
        if (studentMarks.containsKey(queryRollNo)) {
            System.out.println("Roll Number: " + queryRollNo + " | Marks: " + studentMarks.get(queryRollNo));
        } else {
            System.out.println("Roll Number " + queryRollNo + " not found.");
        }
    }
}

/*
INPUT & OUTPUT:

INPUT:
Records: {101: 89, 102: 76, 103: 95, 104: 84}
Query Roll Number: 103

OUTPUT:
Roll Number: 103 | Marks: 95
*/
