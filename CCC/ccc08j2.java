package CCC;

import java.io.*;
import java.util.*;

public class ccc08j2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> playlist = new LinkedList<String>();
        playlist.add("A");
        playlist.add("B");
        playlist.add("C");
        playlist.add("D");
        playlist.add("E");

        int button = sc.nextInt();
        int times = sc.nextInt();

        while (button != 4) {
            if (button == 1) {
                for (int i = 0; i < times; i++) {
                    String move = playlist.get(0);
                    playlist.remove(0);
                    playlist.addLast(move);
                }
            } else if (button == 2) {
                for (int i = 0; i < times; i++) {
                    String move = playlist.get(4);
                    playlist.remove(4);
                    playlist.addFirst(move);
                }
            } else if (button == 3) {
                for (int i = 0; i < times; i++) {
                    String move = playlist.get(1);
                    playlist.remove(1);
                    playlist.addFirst(move);
                }
            }

            button = sc.nextInt();
            times = sc.nextInt();

        }

        for (int i = 0; i < playlist.size(); i++) {
            System.out.print(playlist.get(i) + " ");
        }

    }
}