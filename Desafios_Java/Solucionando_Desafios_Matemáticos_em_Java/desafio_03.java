/*Desafio 3 - Folha de Pagamento*/

package Desafios_Java.Solucionando_Desafios_Matemáticos_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class desafio_03 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int value_1 = Integer.parseInt(reader.readLine());

    int value_2 = Integer.parseInt(reader.readLine());

    double value_3 = Double.parseDouble(reader.readLine());

    double salary = value_2 * value_3;
    
    System.out.format("NUMBER = %d\nSALARY = U$ %.2f", value_1, salary);
  }
}