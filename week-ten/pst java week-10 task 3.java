import java.util.Stack;

class PST_Java_Week10_Task3 {
    private Stack<String> history = new Stack<>();

    public void visit(String url) {
        history.push(url);
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (history.isEmpty()) {
            System.out.println("No history available.");
            return;
        }
        String removed = history.pop();
        System.out.println("Back button pressed. Removed: " + removed);
        if (!history.isEmpty()) {
            System.out.println("Current Page: " + history.peek());
        } else {
            System.out.println("Browser is now at Home page.");
        }
    }

    public static void main(String[] args) {
        PST_Java_Week10_Task3 browser = new PST_Java_Week10_Task3();
        browser.visit("google.com");
        browser.visit("github.com");
        browser.visit("leetcode.com");
        browser.back();
        browser.back();
    }
}

/*
INPUT & OUTPUT:

INPUT:
Visit: google.com -> github.com -> leetcode.com
Action: Back, Back

OUTPUT:
Visited: google.com
Visited: github.com
Visited: leetcode.com
Back button pressed. Removed: leetcode.com
Current Page: github.com
Back button pressed. Removed: github.com
Current Page: google.com
*/
