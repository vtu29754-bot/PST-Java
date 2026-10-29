class SongNode {
    String title;
    SongNode next;

    SongNode(String title) {
        this.title = title;
        this.next = null;
    }
}

class PST_Java_Week10_Task5 {
    private SongNode head;

    public void addSong(String title) {
        SongNode newNode = new SongNode(title);
        if (head == null) {
            head = newNode;
        } else {
            SongNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Added: " + title);
    }

    public void removeSong(String title) {
        if (head == null) return;
        if (head.title.equalsIgnoreCase(title)) {
            head = head.next;
            System.out.println("Removed: " + title);
            return;
        }
        SongNode curr = head;
        while (curr.next != null && !curr.next.title.equalsIgnoreCase(title)) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
            System.out.println("Removed: " + title);
        } else {
            System.out.println("Song not found: " + title);
        }
    }

    public void displayPlaylist() {
        System.out.print("Playlist: ");
        SongNode temp = head;
        while (temp != null) {
            System.out.print(temp.title + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PST_Java_Week10_Task5 playlist = new PST_Java_Week10_Task5();
        playlist.addSong("Shape of You");
        playlist.addSong("Blinding Lights");
        playlist.addSong("Levitating");
        playlist.displayPlaylist();
        playlist.removeSong("Blinding Lights");
        playlist.displayPlaylist();
    }
}

/*
INPUT & OUTPUT:

INPUT:
Add: "Shape of You", "Blinding Lights", "Levitating"
Action: Display
Action: Remove "Blinding Lights"
Action: Display

OUTPUT:
Added: Shape of You
Added: Blinding Lights
Added: Levitating
Playlist: Shape of You -> Blinding Lights -> Levitating
Removed: Blinding Lights
Playlist: Shape of You -> Levitating
*/
