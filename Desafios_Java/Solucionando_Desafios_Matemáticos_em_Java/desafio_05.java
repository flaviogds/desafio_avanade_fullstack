/* Desafio 5 - Análise de Números */

package Desafios_Java.Solucionando_Desafios_Matemáticos_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class desafio_05 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> values = new ArrayList<Integer>();
        
        while(true){
          String input = reader.readLine();
          
          if(input == null || input.isEmpty()){
            break;
          }
          else{
            values.add(Integer.parseInt(input));
          }
        }
        
        List<Integer> par = values.stream().filter(value -> value%2 == 0).collect(Collectors.toList());
        List<Integer> imp = values.stream().filter(value -> value%2 != 0).collect(Collectors.toList());
        List<Integer> pos = values.stream().filter(value -> value > 0).collect(Collectors.toList());
        List<Integer> neg = values.stream().filter(value -> value < 0).collect(Collectors.toList());
        
        System.out.format("%d valor(es) par(es)\n"+
                          "%d valor(es) impar(es)\n"+
                          "%d valor(es) positivo(s)\n"+
                          "%d valor(es) negativo(s)", par.size(), imp.size(), pos.size(), neg.size());
    }
}