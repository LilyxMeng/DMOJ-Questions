package Seasonal;

import java.io.*;
import java.util.*;

public class bts18p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = sc.nextLine();
		int k = sc.nextInt();
		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			char acheck = a.charAt(i);
			char bcheck = b.charAt(i);

			if (acheck != bcheck) {
				count = count + 1;
				if (acheck == ' ' && bcheck != ' ' || acheck != ' ' && bcheck == ' ') {
					count = 1001;
				}

			}

		}
		if (count <= k) {
			System.out.println("Plagiarized");
		} else if (count > k) {
			System.out.println("No plagiarism");
		}

	}
}