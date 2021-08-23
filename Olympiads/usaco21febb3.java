package Olympiads;

import java.util.*;
import java.io.*;

public class usaco21febb3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int n = readInt(); n > 0; n--) {
            String s = readLine();
            int cw = 0, ccw = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1))
                    continue;
                String t = s.substring(i, i + 2);
                if (t.equals("NE") || t.equals("ES") || t.equals("SW") || t.equals("WN"))
                    cw++;
                if (t.equals("NW") || t.equals("EN") || t.equals("SE") || t.equals("WS"))
                    ccw++;
            }
            if (cw > ccw)
                System.out.println("CW");
            else
                System.out.println("CCW");
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
