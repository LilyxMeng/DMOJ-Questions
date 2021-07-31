package Uncategorized;

import java.io.*;
import java.util.*;

public class bf1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int list[] = new int[size];

		for (int i = 0; i < size; i++) {
			list[i] = sc.nextInt();
		}

		Arrays.sort(list);

		for (int i = 0; i < size; i++) {
			System.out.println(list[i]);
		}

	}
}