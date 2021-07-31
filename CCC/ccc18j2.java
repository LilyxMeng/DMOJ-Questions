package CCC;

import java.io.*;
import java.util.*;

public class ccc18j2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int spaces = sc.nextInt();
		String yesterday = sc.next();
		String today = sc.next();
		int occupy = 0;

		for (int i = 0; i < spaces; i++) {

			char one = yesterday.charAt(i);
			char two = today.charAt(i);

			if (one == 'C' && two == 'C') {
				occupy = occupy + 1;
			}
		}

		System.out.println(occupy);

	}
}