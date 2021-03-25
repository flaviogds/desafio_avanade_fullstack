/* Desafio 4 - Hash Mágico */

package Desafios_Java.Resolvendo_Algoritmos_com_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class desafio_04 {

    private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int nCases = Integer.parseInt(reader.readLine());

        for (int counter = 0; counter < nCases; counter++) {

            int nEntries = Integer.parseInt(reader.readLine());

            List<String> inputStrings = new ArrayList<String>();

            for (int lines = 0; lines < nEntries; lines++)
                inputStrings.add(reader.readLine());

            int hashCode = parseHash(inputStrings);

            System.out.println(hashCode);
        }
    }

    public static int parseHash(List<String> input) {

        int indexLine = 0;
        int hashCode = 0;

        for (String line : input) {

            String[] splitStr = line.split("");

            for (int indexChar = 0; indexChar < splitStr.length; indexChar++) {
                hashCode += letters.indexOf(splitStr[indexChar]) + indexLine + indexChar;
            }
            indexLine++;
        }

        return hashCode;
    }
}