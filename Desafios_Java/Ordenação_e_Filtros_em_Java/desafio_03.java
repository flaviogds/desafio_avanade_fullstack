/* Desafio 3 - Uniformes de final de ano */

package Desafios_Java.Ordenação_e_Filtros_em_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class desafio_03 {
  public static void main(String[] args) throws IOException{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    int nEntries = Integer.parseInt(reader.readLine());
    
    List<Student> list = new ArrayList<Student>();
  
    for(int counter = 0; counter < nEntries; counter++){
      
      String student = reader.readLine();
      String[] choice =  reader.readLine().split(" ");
      
      Student entrie = new Student(student, choice[0], choice[1]);
      
      list.add(entrie);
    }
    
    Comparator<Student> orderBy = Comparator.comparing(Student::getColor)
        .thenComparing(Student::getSize, Collections.reverseOrder())
        .thenComparing(Student::getName);
    
    Collections.sort(list, orderBy);
    
    for(Student entrie: list){
      System.out.println(entrie.toString());
    }
  }
  
  public static class Student{
    private String name;
    private String color;
    private String size;
  
    public Student(String name, String color, String size){
      this.name = name;
      this.color = color;
      this.size = size;
    }
    
    public String getName(){
      return name;
    }
    
    public String getColor(){
      return color;
    }
    
    public String getSize(){
      return size;
    }
    
    @Override public String toString(){
      return color + " " + size + " " + name;
    }
  }
}