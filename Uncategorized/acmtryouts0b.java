package Uncategorized;

import java.io.*;
import java.util.*;

public class acmtryouts0b {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int times = sc.nextInt();

		for (int scenerios = 0; scenerios < times; scenerios++) {

			int length = sc.nextInt();
			String first = sc.next();
			String second = sc.next();
			String third = "";
			String output = "";

			for (int i = 0; i < length; i++) {
				third = third + first.charAt(i) + second.charAt(i);
			}

			for (int backwards = 0; backwards < third.length(); backwards++) {
				output = output + third.charAt(third.length() - 1 - backwards);
			}

			System.out.print(output);
			System.out.println();

		}
	}
}