/* Desafio 5 - Gincana no Acampamento */

package Desafios_Java.Ordenação_e_Filtros_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class desafio_05 {
  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int totalStudents;

    while (true) {
      totalStudents = Integer.parseInt(reader.readLine());

      if (totalStudents > 0) {

        List<Student> circle = new ArrayList<Student>();

        for (int counter = 0; counter < totalStudents; counter++) {

          String[] input = reader.readLine().split(" ");

          Student newStudent = new Student(input[0], Integer.parseInt(input[1]));

          circle.add(newStudent);
        }
        
        int index = 0;
        int coinValue = circle.get(index).getCoin();
        int[] response = new int[2];
        
        while(circle.size() > 1){
          response = GetOut(circle, coinValue, index);
          
          coinValue = response[0];
          index = response[1];
        }
        
        System.out.println("Vencedor(a): " + circle.get(0).getName());
      }
      else {
        break;
      }
    }
  }
  
  private static class Student{
    private String name;
    private int coin;
    
    public Student(String name, int coin){
      this.name = name;
      this.coin = coin;
    }
    
    public String getName(){
      return name;
    }
    
    public int getCoin(){
      return coin;
    }
  }
  
  private static int[] GetOut(List<Student> list, int value, int position) {
    
    boolean clockwise = (value%2 == 0) ? true : false;
  
    int index;
    
    if(clockwise){
      index = (list.size() + position - value%list.size())%list.size();
    }
    else{
      index = (position + value%list.size())%list.size();
    }
    
    int newValue = list.remove(index).getCoin();
    
    int newPosition = newValue%2 == 0
                        ? (index <= (list.size() - 1) ? index : 0)
                        : (index == 0 ? (list.size() - 1) : (index - 1));
    
    int[] result = { newValue, newPosition };

    return result;
  }
}