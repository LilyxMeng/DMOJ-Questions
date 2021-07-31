package CCC;

import java.io.*;
import java.util.*;

public class ccc06j1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int burgercal[] = { 461, 431, 420, 0 };
		int sidecal[] = { 100, 57, 70, 0 };
		int drinkcal[] = { 130, 160, 118, 0 };
		int dessertcal[] = { 167, 266, 75, 0 };

		int burger = sc.nextInt() - 1;
		int side = sc.nextInt() - 1;
		int drink = sc.nextInt() - 1;
		int dessert = sc.nextInt() - 1;

		int totalcal = burgercal[burger] + sidecal[side] + drinkcal[drink] + dessertcal[dessert];

		System.out.println("Your total Calorie count is " + totalcal + ".");

	}
}