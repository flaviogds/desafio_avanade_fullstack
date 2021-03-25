/* Desafio 4 - Fila do Banco */

package Desafios_Java.Ordenação_e_Filtros_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class desafio_04 {
  public static void main(String[] args) throws IOException{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    int nEntries = Integer.parseInt(reader.readLine());
    
    for(int counter = 0; counter < nEntries; counter++){

      String[] input = (reader.readLine().split(" "));
      
      int noChanged = newOrder(input);
      
      System.out.println(noChanged);
    }
  }
  
  private static int newOrder(String[] queue){
    Integer[] newQueue = new Integer[queue.length];
    int order = 0;
    
    for(int pos = 0; pos < queue.length; pos++){
      newQueue[pos] = Integer.parseInt(queue[pos]);
    }
    
    Arrays.sort(newQueue, Collections.reverseOrder());
    
    for(int pos = 0; pos < queue.length; pos++){
      if(newQueue[pos] == Integer.parseInt(queue[pos])){
        order++;
      }
    }
    return order;
  }
}
