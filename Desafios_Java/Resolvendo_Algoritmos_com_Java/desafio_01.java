/* Desafio 1 - Coração das cartas*/

package Desafios_Java.Resolvendo_Algoritmos_com_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class desafio_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int nEntries = Integer.parseInt(reader.readLine());

        while (nEntries > 0) {

            Map<String, Integer> storage = new HashMap<String, Integer>();

            String[] inputLine = new String[nEntries];
            Integer[][] staks = new Integer[3][nEntries];

            for (int counter = 0; counter < nEntries; counter++) {

                inputLine = reader.readLine().split(" ");

                staks[0][counter] = Integer.parseInt(inputLine[0]);
                staks[1][counter] = Integer.parseInt(inputLine[1]);
                staks[2][counter] = Integer.parseInt(inputLine[2]);
            }

            boolean winner = SolveLine(staks, storage, 0, 0, 0);

            System.out.println(winner ? 1 : 0);

            nEntries = Integer.parseInt(reader.readLine());
        }
    }

    public static boolean SolveLine(Integer[][] stacks, Map<String, Integer> storage, int a, int b, int c) {

        String indexLines = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);

        int lengthArray = stacks[0].length;

        if (a == b && b == c && c == lengthArray) {
            storage.putIfAbsent(indexLines, 1);
            return true;
        }

        int x = storage.getOrDefault(indexLines, 0);

        if (x > 0) {
            return (x == 1 ? true : false);
        }

        if (a < lengthArray && stacks[0][a] % 3 == 0 && SolveLine(stacks, storage, a + 1, b, c)) {

            storage.putIfAbsent(indexLines, 1);
            return true;
        }

        if (b < lengthArray && stacks[1][b] % 3 == 0 && SolveLine(stacks, storage, a, b + 1, c)) {

            storage.putIfAbsent(indexLines, 1);
            return true;
        }

        if (c < lengthArray && stacks[2][c] % 3 == 0 && SolveLine(stacks, storage, a, b, c + 1)) {

            storage.putIfAbsent(indexLines, 1);
            return true;
        }

        if (a < lengthArray && b < lengthArray && (stacks[0][a] + stacks[1][b]) % 3 == 0
                && SolveLine(stacks, storage, a + 1, b + 1, c)) {

            storage.putIfAbsent(indexLines, 1);
            return true;
        }

        if (a < lengthArray && c < lengthArray && (stacks[0][a] + stacks[2][c]) % 3 == 0
                && SolveLine(stacks, storage, a + 1, b, c + 1)) {

            storage.putIfAbsent(indexLines, 1);
            return true;
        }

        if (b < lengthArray && c < lengthArray && (stacks[1][b] + stacks[2][c]) % 3 == 0
                && SolveLine(stacks, storage, a, b + 1, c + 1)) {

            storage.putIfAbsent(indexLines, 1);
            return true;
        }

        if (a < lengthArray && b < lengthArray && c < lengthArray
                && (stacks[0][a] + stacks[1][b] + stacks[2][c]) % 3 == 0
                && SolveLine(stacks, storage, a + 1, b + 1, c + 1)) {

            storage.putIfAbsent(indexLines, 1);
            return true;
        }

        storage.putIfAbsent(indexLines, 2);
        return false;
    }
}