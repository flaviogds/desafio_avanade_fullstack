/* Desafio 4 - Múltiplos */

package Desafios_Java.Solucionando_Desafios_Matemáticos_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class desafio_04 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> values = Arrays.asList(reader.readLine().split(" "))
                .stream()
                .map(value -> Math.abs(Integer.parseInt(value)))
                .collect(Collectors.toList());

        Collections.sort(values);
        
        if(values.get(1)%values.get(0) == 0){
          System.out.println("Sao Multiplos");
        }else{
          System.out.println("Nao sao Multiplos");
        }
    }
}