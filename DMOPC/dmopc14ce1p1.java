package DMOPC;

import java.io.*;
import java.util.*;

public class dmopc14ce1p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String verb = sc.next();
        String object = sc.next();

        if (object.charAt(object.length() - 1) == 'e') {
            System.out.println(verb + "-tu la " + object + " ?");
        } else if (object.charAt(object.length() - 1) == 's') {
            System.out.println(verb + "-tu les " + object + " ?");
        } else {
            System.out.println(verb + "-tu le " + object + " ?");
        }

    }
}