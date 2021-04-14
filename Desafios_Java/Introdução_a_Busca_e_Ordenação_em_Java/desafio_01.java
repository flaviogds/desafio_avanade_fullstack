/* Desafio 1 - Ordenação de palavras por tamanho*/

package Desafios_Java.Introdução_a_Busca_e_Ordenação_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.*;

public class desafio_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(reader.readLine());

        for (int counter = 0; counter < cases; counter++) {

            List<Word> list = new ArrayList<Word>();

            String[] input = reader.readLine().split(" ");

            for (String str : input) {
                list.add(new Word(str));
            }

            SortingPattern pattern = new SortingPattern();

            Collections.sort(list, pattern);

            String result = list.stream().map(Word::toString).collect(Collectors.joining(" "));

            System.out.println(result);
        }
    }

    public static class Word implements Comparable<Word> {
        private String word;

        public int compareTo(Word wd) {
            return this.word.compareTo(wd.toString());
        }

        public Word(String word) {
            this.word = word;
        }

        @Override
        public String toString() {
            return this.word;
        }
    }

    private static class SortingPattern implements Comparator<Word> {
        public int compare(Word wd1, Word wd2) {
            if (wd1.toString().length() < wd2.toString().length()) {
                return 1;
            } else if (wd1.toString().length() > wd2.toString().length()) {
                return -1;
            } else {
                return wd1.compareTo(wd2);
            }
        }
    }
}