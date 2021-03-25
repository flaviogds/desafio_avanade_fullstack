/* Desafio 5 - O tabuleiro secreto */

package Desafios_Java.Resolvendo_Algoritmos_com_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class desafio_05 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int boardSize = Integer.parseInt(input[0]);

        int qOps = Integer.parseInt(input[1]);

        String[][] board = new String[boardSize][boardSize];

        for (int turn = 0; turn < qOps; turn++) {

            String[] entrie = reader.readLine().split(" ");

            switch (entrie[0]) {
            case "1":
                fillBoard(board, "line", entrie[2], entrie[1]);
                break;
            case "2":
                fillBoard(board, "column", entrie[2], entrie[1]);
                break;
            case "3":
                frequency(board, "line", entrie[1]);
                break;
            case "4":
                frequency(board, "column", entrie[1]);
                break;
            default:
                break;
            }
        }
    }

    public static void fillBoard(String[][] board, String origin, String value, String direction) {

        int coordinate = Integer.parseInt(direction) - 1;

        for (int index = 0; index < board[0].length; index++) {

            if (origin.equals("line"))
                board[coordinate][index] = value;

            else
                board[index][coordinate] = value;
        }
    }

    public static void frequency(String[][] board, String origin, String direction) {
        List<String> section = new ArrayList<String>();

        int coordinate = Integer.parseInt(direction) - 1;

        String bigger = "";

        if (origin.equals("line")) {
            for (int index = 0; index < board[0].length; index++) {
                section.add(board[coordinate][index]);
            }
            bigger = occurrence(section);
        } else {
            for (int index = 0; index < board[0].length; index++) {
                section.add(board[index][coordinate]);
            }
            bigger = occurrence(section);
        }
        System.out.println(bigger);
    }

    public static String occurrence(List<String> section) {
        Map<String, Integer> variables = new HashMap<String, Integer>();

        for (String unit : section)
            if (unit != null)
                variables.putIfAbsent(unit, 0);

        for (Map.Entry<String, Integer> entry : variables.entrySet()) {
            for (String unit : section) {
                if (entry.getKey().equals(unit))
                    variables.put(entry.getKey(), entry.getValue() + 1);
            }
        }

        int maxKey = 0;
        int maxOccurrence = 0;

        for (Map.Entry<String, Integer> entry : variables.entrySet()) {
            int key = Integer.parseInt(entry.getKey());
            int value = entry.getValue();

            if (value >= maxOccurrence && key > maxKey) {
                maxOccurrence = value;
                maxKey = key;
            }
        }
        return String.valueOf(maxKey);
    }
}