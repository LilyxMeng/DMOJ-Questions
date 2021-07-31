package Uncategorized;

import java.io.*;
import java.util.*;

public class hci16oversleep {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt(), cols = sc.nextInt();

        int startRow = -1, startCol = -1;
        int endRow = -1, endCol = -1;

        char[][] map = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String rowInput = sc.next();
            map[row] = rowInput.toCharArray();
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (map[row][col] == 's') {
                    startRow = row;
                    startCol = col;
                }
                if (map[row][col] == 'e') {
                    endRow = row;
                    endCol = col;
                }
            }
        }

        int[][] step = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                step[row][col] = Integer.MAX_VALUE;
            }
        }
        LinkedList<Integer> rowQ = new LinkedList<Integer>(), colQ = new LinkedList<Integer>();

        step[startRow][startCol] = 0;
        rowQ.add(startRow);
        colQ.add(startCol);

        while (!rowQ.isEmpty()) {

            int currRow = rowQ.pop(), currCol = colQ.pop();

            if (currRow - 1 >= 0 && map[currRow - 1][currCol] != 'X'
                    && step[currRow][currCol] + 1 < step[currRow - 1][currCol]) {
                step[currRow - 1][currCol] = step[currRow][currCol] + 1;

                rowQ.add(currRow - 1);
                colQ.add(currCol);
            }

            if (currRow + 1 < rows && map[currRow + 1][currCol] != 'X'
                    && step[currRow][currCol] + 1 < step[currRow + 1][currCol]) {
                step[currRow + 1][currCol] = step[currRow][currCol] + 1;

                rowQ.add(currRow + 1);
                colQ.add(currCol);
            }

            if (currCol + 1 < cols && map[currRow][currCol + 1] != 'X'
                    && step[currRow][currCol] + 1 < step[currRow][currCol + 1]) {
                step[currRow][currCol + 1] = step[currRow][currCol] + 1;

                rowQ.add(currRow);
                colQ.add(currCol + 1);
            }

            if (currCol - 1 >= 0 && map[currRow][currCol - 1] != 'X'
                    && step[currRow][currCol] + 1 < step[currRow][currCol - 1]) {
                step[currRow][currCol - 1] = step[currRow][currCol] + 1;

                rowQ.add(currRow);
                colQ.add(currCol - 1);
            }
        }

        if (step[endRow][endCol] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(step[endRow][endCol] - 1);
        }

    }
}