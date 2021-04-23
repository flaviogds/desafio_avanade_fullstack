/* Desafio 1 - Cálculo de viagem*/

package Desafios_Java.Solucionando_Desafios_Matemáticos_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class desafio_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Double> param = Arrays.asList(reader.readLine().split(" "))
                .stream()
                .map(value -> Double.parseDouble(value))
                .collect(Collectors.toList());

        double consume = (param.get(0) * param.get(1)) / 12;

        System.out.format("%10.3f%n", consume);
    }
}