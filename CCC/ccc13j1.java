package CCC;

import java.io.*;
import java.util.*;

public class ccc13j1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int youngest = sc.nextInt();
		int middle = sc.nextInt();

		int difference = middle - youngest;

		int oldest = middle + difference;

		System.out.println(oldest);

	}
}