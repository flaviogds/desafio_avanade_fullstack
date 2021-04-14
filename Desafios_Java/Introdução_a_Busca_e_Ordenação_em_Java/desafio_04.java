/* Desafio 4 - Pedra, Papel, Tesoura, Lagarto e Spock */

package Desafios_Java.Introdução_a_Busca_e_Ordenação_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class desafio_04 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int nEntries = Integer.parseInt(reader.readLine());

        for (int nCase = 1; nCase <= nEntries; nCase++) {
            String[] input = reader.readLine().toLowerCase().split(" ");

            boolean winner = Winner(input);

            if (input[0].equals(input[1])) {
                System.out.println("empate");
            } else if (winner) {
                System.out.println("Fernanda");
            } else {
                System.out.println("Marcia");
            }
        }
    }

    private static boolean Winner(String[] players) {
        String[] lagarto = { "papel", "spock" };
        String[] papel = { "spock", "pedra" };
        String[] pedra = { "tesoura", "lagarto" };
        String[] spock = { "pedra", "tesoura" };
        String[] tesoura = { "papel", "lagarto" };

        switch (players[0]) {
        case "lagarto":
            return Arrays.asList(lagarto).contains(players[1]);
        case "papel":
            return Arrays.asList(papel).contains(players[1]);
        case "pedra":
            return Arrays.asList(pedra).contains(players[1]);
        case "Spock":
            return Arrays.asList(spock).contains(players[1]);
        case "tesoura":
            return Arrays.asList(tesoura).contains(players[1]);
        default:
            return false;
        }
    }
}
