package CCC;

import java.io.*;
import java.util.*;

public class ccc13j2 {
    public static void main(String[] args) {
        
               Scanner sc = new Scanner(System.in);

        String sign = sc.nextLine();
        boolean no = false;

        for (int i = 0; i < sign.length(); i++) {

            if (sign.charAt(i) != 'I' && sign.charAt(i) != 'O' && sign.charAt(i) != 'S' &&
                    sign.charAt(i) != 'H' && sign.charAt(i) != 'Z' &&
                    sign.charAt(i) != 'X' && sign.charAt(i) != 'N') {
                System.out.println("NO");
                no = true;
                break;
            }
        }

        if (no == false) {
            System.out.println("YES");
        }

    }
}