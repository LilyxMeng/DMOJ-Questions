package DMOPC;

import java.io.*;
import java.util.*;

public class dmopc17c1p1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int R = readInt(), C = readInt(), row[] = new int[R], col[] = new int[C];
        for (int i = 0; i < R; i++) {
            String s = readLine();
            for (int j = 0; j < C; j++) {
                if (s.charAt(j) == 'X') {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int q = readInt(); q > 0; q--) {
            int c = readInt() - 1, r = readInt() - 1;
            if (row[r] == 1 || col[c] == 1) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
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