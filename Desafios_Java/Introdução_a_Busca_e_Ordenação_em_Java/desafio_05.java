/* Desafio 2 - Encontre a maior substring */

package Desafios_Java.Introdução_a_Busca_e_Ordenação_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class desafio_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String patternBold = "\\*(.*?!*)\\*";
        String patternItalic = "\\_(.*?!*)\\_";

        while (true) {
            String input = reader.readLine();

            if (input == null || input.isEmpty()) {
                break;
            } else {
                String newString = input
                                    .replaceAll(patternBold, "<b>$1</b>")
                                    .replaceAll(patternItalic, "<i>$1</i>");

                System.out.println(newString);
            }
        }
    }
}