/* Desafio 3 - Validador de senhas com requisitos*/

package Desafios_Java.Introdução_a_Busca_e_Ordenação_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class desafio_03 {
    public final static int MAX = 200;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String passwd = new String("");

        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?!.*[@!#$%^~&+´`?=])(?=\\S+$).{6,32}$";

        while (true) {
            passwd = reader.readLine();

            if (passwd != null) {
                if (passwd.matches(pattern)) {
                    System.out.println("Senha valida.");
                } else {
                    System.out.println("Senha invalida.");
                }
            } else {
                break;
            }
        }
    }
}
