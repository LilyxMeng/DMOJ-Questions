package ECOO;

import java.io.*;
import java.util.*;

public class ecoo16r1p3 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int t = 1; t <= 10; t++) {
            int n = readInt();
            List<Integer> a = new ArrayList();
            for (int i = 1; i <= n; i++) {
                a.add(readInt());
            }
            int cost = 0;
            for (int i = n - 1; i >= 1; i--) {
                int cur = a.indexOf(i), nxt = a.indexOf(i + 1);
                if (cur > nxt) {
                    a.remove(cur);
                    a.add(0, i);
                    cost += cur;
                }
            }
            System.out.println(cost);
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}