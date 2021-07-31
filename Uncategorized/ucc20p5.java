package Uncategorized;

import java.io.*;
import java.util.*;

public class ucc20p5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nodes = sc.nextInt(), start = sc.nextInt(), end = sc.nextInt(), edges = sc.nextInt();

        ArrayList<Integer>[] neighbors = new ArrayList[nodes + 1];
        for (int i = 0; i < neighbors.length; i++) {
            neighbors[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < edges; i++) {
            int bv = sc.nextInt(), ev = sc.nextInt();
            neighbors[bv].add(ev);
        }

        int[] step = new int[nodes + 1];
        Arrays.fill(step, Integer.MAX_VALUE);
        LinkedList<Integer> q = new LinkedList<Integer>();

        step[start] = 0;
        q.add(start);

        while (!q.isEmpty()) {
            int currNode = q.pop();
            for (int neighbor : neighbors[currNode]) {
                int oldPathLength = step[neighbor];
                int newPathLength = step[currNode] + 1;
                if (newPathLength < oldPathLength) {
                    step[neighbor] = newPathLength;
                    q.add(neighbor);
                }
            }
        }
        System.out.println(step[end]);

    }
}