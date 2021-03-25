/*Desafio 2 - Abreviando posts do blog*/

package Desafios_Java.Resolvendo_Algoritmos_com_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class desafio_02 {

  private static final String[] letters = "abcdefghijklmnopqrstuvwxyz".split("");

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String input = reader.readLine().toLowerCase();

      if (input.equals("."))
        break;

      else {
        Map<String, String[]> newString = new HashMap<String, String[]>();

        newString = Shorten(input.split(" "));

        getShorten(newString);
      }
    }
  }

  private static void getShorten(Map<String, String[]> newString) {

    List<String> string = Arrays.asList(newString.get("newString"));

    System.out.println(String.join(" ", string));

    System.out.println(newString.get("length")[0]);

    for (String word : newString.get("shortened"))
      System.out.println(word);

  }

  public static Map<String, String[]> Shorten(String[] inputString) {
    String[] newString = inputString.clone();

    List<Map<String, String>> storeChanges = new ArrayList<Map<String, String>>();

    Map<String, String[]> shortenedString = new HashMap<String, String[]>();

    for (String letter : letters) {
      Map<String, String> wordShort = new HashMap<String, String>();

      String filter = "";

      for (String str : inputString) {
        if (str.startsWith(letter) && str.length() > 3 && str.length() > filter.length()) {
          filter = str;
          wordShort.put(letter, filter);
        }
      }
      if (filter != "")
        storeChanges.add(wordShort);
    }

    for (int index = 0; index < newString.length; index++) {
      for (Map<String, String> map : storeChanges) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
          if (newString[index].equals(entry.getValue())) {
            newString[index] = entry.getKey() + ".";
          }
        }
      }
    }

    String[] wordsReplaced = new String[storeChanges.size()];

    for (int index = 0; index < storeChanges.size(); index++) {
      for (Map.Entry<String, String> entry : storeChanges.get(index).entrySet()) {
        wordsReplaced[index] = entry.getKey() + ". = " + entry.getValue();
      }
    }

    shortenedString.put("newString", newString);
    shortenedString.put("length", new String[] { String.valueOf(storeChanges.size()) });
    shortenedString.put("shortened", wordsReplaced);

    return shortenedString;
  }
}