import java.util.ArrayList;

public class JavaInstanceofKeyword {
    static class Student {}
    static class Rockstar {}
    static class Hacker {}

    public static String count(ArrayList<Object> mylist) {
        int countStudent = 0;
        int countRockstar = 0;
        int countHacker = 0;

        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            if (element instanceof Student) countStudent++;
            if (element instanceof Rockstar) countRockstar++;
            if (element instanceof Hacker) countHacker++;
        }

        return countStudent + " " + countRockstar + " " + countHacker;
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        mylist.add(new Student());
        mylist.add(new Rockstar());
        mylist.add(new Hacker());
        mylist.add(new Hacker());

        System.out.println("Input: List with 1 Student, 1 Rockstar, 2 Hackers");
        System.out.println("Output: " + count(mylist));
    }
}

/*
INPUT & OUTPUT:

Input: List with 1 Student, 1 Rockstar, 2 Hackers
Output: 1 1 2
*/
