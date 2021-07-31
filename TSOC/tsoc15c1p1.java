package TSOC;

import java.io.*;
import java.util.*;

public class tsoc15c1p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String random = sc.nextLine();

        String[] nonmetal = new String[] { "Cl", "Br", "Xe", "Kr", "Si", "As", "Rn", "Ne", "He", "H", "C", "N", "O",
                "F", "P", "S", "I" };

        for (int i = 0; i < n; i++) {
            String elements = sc.nextLine();

            String[] compound = elements.split(" ");
            boolean molecular = false;

            for (int j = 0; j < compound.length; j++) {

                if (!molecular && j >= 1) {
                    break;
                }

                for (int k = 0; k < nonmetal.length; k++) {

                    if (compound[j].equals(nonmetal[k])) {
                        molecular = true;
                        break;
                    } else {
                        molecular = false;
                    }
                }

            }

            if (molecular) {
                System.out.println("Molecular!");
            } else {
                System.out.println("Not molecular!");
            }
        }

    }
}