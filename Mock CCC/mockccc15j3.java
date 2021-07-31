import java.io.*;
import java.util.*;

public class mockccc15j3 {
    public static void main(String[] args) {
        
                Scanner sc = new Scanner(System.in);

        int contests = sc.nextInt();
        String random = sc.nextLine();
        String level = sc.nextLine();
        String[] difficulties = level.split(" ");
        String[] different = new String[difficulties.length];
        int count = 0;

        for (int i = 0; i < difficulties.length; i++) {
            boolean contains = false;

            for (int j = 0; j < different.length; j++) {
                if (difficulties[i].equals(different[j])) {
                    contains = true;
                    break;
                }
            }

            if (!contains) {
                different[i] = difficulties[i];
                count += 1;
            }
        }

        System.out.println(count);

    }
}