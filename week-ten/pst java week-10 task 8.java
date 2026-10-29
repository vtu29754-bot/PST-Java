import java.util.HashSet;
import java.util.Set;

class PST_Java_Week10_Task8 {
    public static void main(String[] args) {
        Set<String> student1 = new HashSet<>();
        student1.add("Mathematics");
        student1.add("Physics");
        student1.add("Computer Science");
        student1.add("English");

        Set<String> student2 = new HashSet<>();
        student2.add("Chemistry");
        student2.add("Physics");
        student2.add("English");
        student2.add("Biology");

        System.out.println("Student 1 Subjects: " + student1);
        System.out.println("Student 2 Subjects: " + student2);

        Set<String> common = new HashSet<>(student1);
        common.retainAll(student2);
        System.out.println("Common Subjects: " + common);
    }
}

/*
INPUT & OUTPUT:

INPUT:
Student 1 Subjects: [Mathematics, Physics, Computer Science, English]
Student 2 Subjects: [Chemistry, Physics, English, Biology]

OUTPUT:
Student 1 Subjects: [English, Mathematics, Physics, Computer Science]
Student 2 Subjects: [English, Chemistry, Biology, Physics]
Common Subjects: [English, Physics]
*/
