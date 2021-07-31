package CCC;

import java.io.*;
import java.util.*;

public class ccc19j2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int lines = sc.nextInt();

		for (int i = 0; i < lines; i++) {

			int num = sc.nextInt();
			String symbol = sc.next();

			for (int output = 0; output < num; output++) {
				System.out.print(symbol);
			}

			System.out.println();

		}

	}
}