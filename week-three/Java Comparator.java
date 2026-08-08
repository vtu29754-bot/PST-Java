import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }
        return a.name.compareTo(b.name);
    }
}

class PST_Java_Week3_Task8 {
    public static void main(String[] args) {
        Player[] players = {
            new Player("amy", 100),
            new Player("david", 100),
            new Player("heraldo", 50),
            new Player("aakansha", 75),
            new Player("aleksa", 150)
        };

        System.out.println("Input Players:");
        for (Player p : players) System.out.println(p);

        Arrays.sort(players, new Checker());

        System.out.println("\nOutput (Sorted Players):");
        for (Player p : players) System.out.println(p);
    }
}

/*
INPUT & OUTPUT:

Input Players:
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Output (Sorted Players):
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
*/
