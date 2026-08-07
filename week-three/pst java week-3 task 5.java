import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getCgpa() { return cgpa; }
}

class PST_Java_Week3_Task5 {
    public static List<String> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>(
            Comparator.comparing(Student::getCgpa).reversed()
                      .thenComparing(Student::getName)
                      .thenComparing(Student::getId)
        );

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                pq.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                pq.poll();
            }
        }

        List<String> remaining = new ArrayList<>();
        while (!pq.isEmpty()) {
            remaining.add(pq.poll().getName());
        }
        return remaining;
    }

    public static void main(String[] args) {
        List<String> events = Arrays.asList(
            "ENTER John 3.75 50",
            "ENTER Mark 3.8 24",
            "ENTER Shafaet 3.7 35",
            "SERVED",
            "SERVED",
            "ENTER Samiha 3.85 36",
            "SERVED",
            "ENTER Ashley 3.9 42",
            "ENTER Maria 3.6 46",
            "ENTER Anik 3.95 49",
            "ENTER Dan 3.95 50",
            "SERVED"
        );

        System.out.println("Input Events:");
        events.forEach(System::println);

        List<String> result = getStudents(events);
        System.out.println("\nOutput (Remaining Students in PQ):");
        if (result.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            result.forEach(System::println);
        }
    }
}

/*
INPUT & OUTPUT:

Input Events:
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

Output (Remaining Students in PQ):
Dan
Ashley
Maria
John
Shafaet
*/
