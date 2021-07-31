package CCC;

import java.io.*;
import java.util.*;

public class ccc12j1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int speedlimit = sc.nextInt();
		int carspeed = sc.nextInt();
		int difference = carspeed - speedlimit;

		if (difference <= 0) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else if (difference >= 1 && difference < 20) {
			System.out.println("You are speeding and your fine is $100.");
		} else if (difference >= 20 && difference < 30) {
			System.out.println("You are speeding and your fine is $270.");
		} else if (difference >= 30) {
			System.out.println("You are speeding and your fine is $500.");
		}

	}
}