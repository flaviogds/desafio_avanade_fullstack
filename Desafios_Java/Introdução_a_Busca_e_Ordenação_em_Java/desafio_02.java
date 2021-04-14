/* Desafio 2 - Encontre a maior substring */

package Desafios_Java.Introdução_a_Busca_e_Ordenação_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class desafio_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input_1 = reader.readLine();
            String input_2 = reader.readLine();
            int result;

            if (input_1 == null || input_1.trim().isEmpty()) {
                break;
            } else {
                if (input_1.length() >= input_2.length()) {
                    result = Substring(input_1, input_2);
                } else {
                    result = Substring(input_2, input_1);
                }
                System.out.println(result);
            }
        }
    }

    private static int Substring(String strMajor, String str) {

        String substr = "";

        if (strMajor.matches("(.*)" + str + "(.*)")) {
            substr = str;
        } else {
            for (int start = 0; start <= str.length(); start++) {
                for (int end = start + 1; end <= str.length(); end++) {

                    String slice = str.substring(start, end);

                    if (strMajor.matches("(.*)" + slice + "(.*)") && substr.length() < slice.length()) {
                        substr = slice;
                    }
                }
            }
        }
        return substr.length();
    }
}