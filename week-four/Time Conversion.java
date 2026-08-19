public class TimeConversion {
    public static String timeConversion(String s) {
        String period = s.substring(8); // AM or PM
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8); // :MM:SS
        
        if (period.equals("AM")) {
            if (hour == 12) hour = 0;
        } else {
            if (hour != 12) hour += 12;
        }
        
        return String.format("%02d%s", hour, rest);
    }

    public static void main(String[] args) {
        String input1 = "07:05:45PM";
        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + timeConversion(input1));

        String input2 = "12:01:00AM";
        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + timeConversion(input2));
    }
}

/*
INPUT & OUTPUT:

Input 1: 07:05:45PM
Output 1: 19:05:45

Input 2: 12:01:00AM
Output 2: 00:01:00
*/
