/*Desafio 2 - Área do Círculo*/

package Desafios_Java.Solucionando_Desafios_Matemáticos_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class desafio_02 {
  
  private static final double PI = 3.14159;
  
  public static void main(String[] args) throws IOException{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    Double radius = Double.parseDouble(reader.readLine());
                            
    double area = PI * Math.pow(radius, 2);
    
    System.out.format("A=%.4f%n", area);
    
  }
}