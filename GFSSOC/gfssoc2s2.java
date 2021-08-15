package GFSSOC;

import java.io.*;
import java.util.*;

public class gfssoc2s2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(), t = readInt();
		pair[] a = new pair[n];
		for(int i=0; i<n; i++) {
			a[i] = new pair(next(), readInt());
		}
		Arrays.sort(a);
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++)
				for(int k=j+1; k<n; k++) 
					if(a[i].cost + a[j].cost + a[k].cost <= t) 
						System.out.println(a[i].card + " " + a[j].card + " " + a[k].card);
		}
	}
	static class pair implements Comparable<pair>{
		String card; int cost;
		pair(String name, int num) { card = name; cost = num; }
		public int compareTo(pair x) { return card.compareTo(x.card); }
	}
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
