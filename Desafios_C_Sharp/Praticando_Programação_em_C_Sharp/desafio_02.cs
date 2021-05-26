/* Desafio 2 - Compras no Supermercado*/

using System;

class desafio_02 {
  public static void Main (string[] args) {
    var totalDeCasosDeTeste = int.Parse(Console.ReadLine());
    
    for(int i = 0; i < totalDeCasosDeTeste; i++){
      
      string[] input = Console.ReadLine().Split(" ");
      
      Array.Sort(input);
      
      string[] list = new string[1];
      
      for(int j = 0; j < input.Length; j++){
        if(!Array.Exists(list, element => element == input[j])){
          list[list.Length-1] = input[j];
          Array.Resize(ref list, list.Length+1);
        }
      }

      foreach (string str in list){
        Console.Write(str+" ");
      }
      Console.WriteLine("");
    }
  }
}