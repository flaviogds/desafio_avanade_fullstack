/* Desafio 1 - Ordenando Números Pares e Ímpares*/

package Desafios_Java.Ordenação_e_Filtros_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class desafio_01 {
        public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int nEntries = Integer.parseInt(reader.readLine());

        int[] par = {};
        int[] imp = {};

        for(int counter = 0; counter < nEntries; counter++){
            
            int input = Integer.parseInt(reader.readLine());

            if(input%2 == 0){
                par = Arrays.copyOf(par, par.length + 1);
                par[par.length-1] = input;
                Arrays.sort(par);
            }
            else{
                imp = Arrays.copyOf(imp, imp.length + 1);
                imp[imp.length-1] = input;
                Arrays.sort(imp);
            }
        }

        for(int pos = 0; pos < par.length; pos++){
            System.out.println(par[pos]);
        }
        for(int pos = imp.length-1; pos >= 0; pos--){
            System.out.println(imp[pos]);
        }
    }
}