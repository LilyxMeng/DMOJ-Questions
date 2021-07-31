import java.io.*;
import java.util.*;

public class mockccc15j1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String number = sc.next();

        if (code.equals("416") && number.length() == 7) {
            System.out.println("valuable");
        } else if (code.equals("647") && number.length() == 7) {
            System.out.println("valueless");
        } else if (code.equals("437") && number.length() == 7) {
            System.out.println("valueless");
        } else {
            System.out.println("invalid");
        }


    }
}