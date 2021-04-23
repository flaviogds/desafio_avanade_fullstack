/* Desafio 1 - Exibindo Números Pares */

package Desafios_Java.Iniciando_a_Programação_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class desafio_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        for (int element = 1; element <= number; element++) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }
    }
}