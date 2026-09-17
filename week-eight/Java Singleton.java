public class JavaSingleton {
    static class Singleton {
        public String str;
        private static Singleton instance;

        private Singleton() {}

        public static Singleton getSingleInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton s = Singleton.getSingleInstance();
        s.str = "Hello I am a singleton! Let us be friends";
        System.out.println("Input/Message: " + s.str);
        
        Singleton s2 = Singleton.getSingleInstance();
        System.out.println("Output (Same Instance): " + s2.str);
    }
}

/*
INPUT & OUTPUT:

Input/Message: Hello I am a singleton! Let us be friends
Output (Same Instance): Hello I am a singleton! Let us be friends
*/
