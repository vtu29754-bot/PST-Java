import java.util.ArrayList;
import java.util.List;

public class DesignBrowserHistory {
    static class BrowserHistory {
        private List<String> history = new ArrayList<>();
        private int currentIndex = 0;

        public BrowserHistory(String homepage) {
            history.add(homepage);
            currentIndex = 0;
        }

        public void visit(String url) {
            history = new ArrayList<>(history.subList(0, currentIndex + 1));
            history.add(url);
            currentIndex++;
        }

        public String back(int steps) {
            currentIndex = Math.max(0, currentIndex - steps);
            return history.get(currentIndex);
        }

        public String forward(int steps) {
            currentIndex = Math.min(history.size() - 1, currentIndex + steps);
            return history.get(currentIndex);
        }
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");

        System.out.println("back(1): " + browserHistory.back(1));
        System.out.println("back(1): " + browserHistory.back(1));
        System.out.println("forward(1): " + browserHistory.forward(1));

        browserHistory.visit("linkedin.com");
        System.out.println("forward(2): " + browserHistory.forward(2));
        System.out.println("back(2): " + browserHistory.back(2));
        System.out.println("back(7): " + browserHistory.back(7));
    }
}

/*
INPUT & OUTPUT:

back(1): facebook.com
back(1): google.com
forward(1): facebook.com
forward(2): linkedin.com
back(2): google.com
back(7): leetcode.com
*/
