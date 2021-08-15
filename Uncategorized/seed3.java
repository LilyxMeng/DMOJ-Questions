package Uncategorized;

import java.io.*;
import java.util.*;

public class seed3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int station = readInt(), min = readInt(), waves = readInt(), dif[] = new int[station + 2];
        for (int i = 0; i < waves; i++) {
            int L = readInt(), R = readInt(), v = readInt();
            dif[L] += v; dif[R + 1] -= v;
        }
        int ans = 0;
        for (int i = 1; i <= station; i++) {
            dif[i] += dif[i -1];
            if (dif[i] < min) {
                ans += 1;
            }
        }
        System.out.println(ans);
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
}
