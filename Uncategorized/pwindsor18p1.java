package Uncategorized;

import java.io.*;
import java.util.*;

public class pwindsor18p1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		if (s.contains("java")) {
			System.out.println(s.indexOf("java"));
		} else {
			System.out.println(s.length());
		}

	}
}