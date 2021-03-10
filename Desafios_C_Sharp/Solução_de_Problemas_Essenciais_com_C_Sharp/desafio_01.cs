/* Desafio 1 - Quadrado e ao Cubo */
using System;

class Desafio {
  static void Main(string[] args) {
    int input = Int32.Parse(Console.ReadLine());

    for(int element = 1; element <= input; element++ ){
      int square = element * element;
      int cube = square * element;
      Console.WriteLine(element.ToString()+" "+square.ToString()+" "+cube.ToString());
    }
  }
}