import java.util.*;

class PST_Java_Week11_Task4 {
    static class Student {
        String name;
        double grade;

        Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static void printSecondLowest(List<Student> students) {
        TreeSet<Double> distinctGrades = new TreeSet<>();
        for (Student s : students) {
            distinctGrades.add(s.grade);
        }
        if (distinctGrades.size() < 2) return;

        Iterator<Double> it = distinctGrades.iterator();
        it.next(); // Skip lowest
        double secondLowest = it.next();

        List<String> names = new ArrayList<>();
        for (Student s : students) {
            if (s.grade == secondLowest) {
                names.add(s.name);
            }
        }
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Harry", 37.21));
        students.add(new Student("Berry", 37.21));
        students.add(new Student("Tina", 37.2));
        students.add(new Student("Akriti", 41.0));
        students.add(new Student("Harsh", 39.0));

        System.out.println("Output (Alphabetical order of second lowest grade students):");
        printSecondLowest(students);
    }
}

/*
INPUT & OUTPUT:

INPUT:
Students:
[Harry: 37.21, Berry: 37.21, Tina: 37.2, Akriti: 41.0, Harsh: 39.0]

OUTPUT:
Output (Alphabetical order of second lowest grade students):
Berry
Harry
*/
