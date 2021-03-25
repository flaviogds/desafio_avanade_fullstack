/*Desafio 3 - Combinação de strings*/

package Desafios_Java.Resolvendo_Algoritmos_com_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class desafio_03 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int nEntries = Integer.parseInt(reader.readLine());

        for (int counter = 0; counter < nEntries; counter++) {

            String[] input = reader.readLine().split(" ");

            String mergedString = merge(input[0].split(""), input[1].split(""));

            System.out.println(mergedString);
        }
    }

    public static String merge(String[] firstStr, String[] secondStr) {

        int maxLength = Math.max(firstStr.length, secondStr.length);

        List<String> newString = new ArrayList<String>();

        for (int index = 0; index < maxLength; index++) {

            if (index < firstStr.length)
                newString.add(firstStr[index]);

            if (index < secondStr.length)
                newString.add(secondStr[index]);
        }

        return String.join("", newString);
    }
}