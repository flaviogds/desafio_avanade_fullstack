/* Desafio 2 - Compras no Supermercado */

package Desafios_Java.Ordenação_e_Filtros_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class desafio_02 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int nEntries = Integer.parseInt(reader.readLine());

        for (int counter = 0; counter < nEntries; counter++) {

            String[] list = reader.readLine().split(" ");

            Arrays.sort(list);

            int newLength = arrayFilter(list);

            for (int pos = 0; pos < newLength; pos++) {
                System.out.print(list[pos] + " ");
            }
            System.out.print("\n");
        }
    }

    private static int arrayFilter(String[] list) {
        String[] filter = new String[list.length];

        int index = 0;

        for (int i = 0; i < list.length - 1; i++) {
            if (!list[i].equals(list[i + 1])) {
                filter[index] = list[i];
                index++;
            }
        }
        filter[index++] = list[list.length - 1];

        for (int i = 0; i < index; i++) {
            list[i] = filter[i];
        }

        return index;
    }
}