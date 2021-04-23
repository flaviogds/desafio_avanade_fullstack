/* Desafio 2 - Entrada e Saída CPF */

package Desafios_Java.Iniciando_a_Programação_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class desafio_02 {
  public static void main(String[] args) throws IOException{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    String number = reader.readLine();
    
    String[] decompose = number.split("\\.|-");
    
    for(String sub: decompose){
      System.out.println(sub);
    }
  }
}
