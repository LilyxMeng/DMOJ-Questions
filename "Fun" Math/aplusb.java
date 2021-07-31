import java.io.*;
import java.util.*;

public class aplusb {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int total = 0;
		int times = sc.nextInt();

		for (int run = 1; run <= times; run++) {

			num1 = sc.nextInt();
			num2 = sc.nextInt();
			total = num1 + num2;

			System.out.println(total);
		}

	}
}