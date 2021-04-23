/* Desafio 3 - DDD */

package Desafios_Java.Iniciando_a_Programação_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class desafio_03 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();

        System.out.println(Exists(number));
    }

    private static String Exists(String number) {
        switch (number) {
        case "11":
            return "Sao Paulo";
        case "19":
            return "Campinas";
        case "21":
            return "Rio de Janeiro";
        case "27":
            return "Vitoria";
        case "31":
            return "Belo Horizonte";
        case "32":
            return "Juiz de Fora";
        case "61":
            return "Brasilia";
        case "71":
            return "Salvador";
        default:
            return "DDD nao cadastrado";
        }
    }
}