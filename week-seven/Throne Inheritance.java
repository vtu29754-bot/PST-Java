import java.util.*;

public class ThroneInheritance {
    static class Kingdom {
        private String king;
        private Map<String, List<String>> children = new HashMap<>();
        private Set<String> dead = new HashSet<>();

        public Kingdom(String kingName) {
            this.king = kingName;
            children.put(kingName, new ArrayList<>());
        }

        public void birth(String parentName, String childName) {
            children.putIfAbsent(parentName, new ArrayList<>());
            children.get(parentName).add(childName);
            children.put(childName, new ArrayList<>());
        }

        public void death(String name) {
            dead.add(name);
        }

        public List<String> getInheritanceOrder() {
            List<String> order = new ArrayList<>();
            dfs(king, order);
            return order;
        }

        private void dfs(String current, List<String> order) {
            if (!dead.contains(current)) {
                order.add(current);
            }
            if (children.containsKey(current)) {
                for (String child : children.get(current)) {
                    dfs(child, order);
                }
            }
        }
    }

    public static void main(String[] args) {
        Kingdom kingdom = new Kingdom("king");
        kingdom.birth("king", "andy");
        kingdom.birth("king", "bob");
        kingdom.birth("king", "catherine");
        kingdom.birth("andy", "matthew");
        kingdom.birth("bob", "alex");
        kingdom.birth("bob", "asha");

        System.out.println("Inheritance order: " + kingdom.getInheritanceOrder());

        kingdom.death("bob");
        System.out.println("Inheritance order after bob's death: " + kingdom.getInheritanceOrder());
    }
}

/*
INPUT & OUTPUT:

Inheritance order: [king, andy, matthew, bob, alex, asha, catherine]
Inheritance order after bob's death: [king, andy, matthew, alex, asha, catherine]
*/
