/* Desafio 4 - Validação de Nota */

using System;

class Desafio {
    static void Main(string[] args) {
    
    float sum = 0;
    int counter = 0;
    bool end = false;
    
    while(!end)
    {
      float input = float.Parse(Console.ReadLine());
      
      if(input >= 0 && input <=10)
      {
        sum += input;
        counter++;
      }
      else
      {
        Console.WriteLine("nota invalida");
      }
      if(counter == 2)
      {
        float media = (sum/2);
        
        Console.WriteLine("media = " + media.ToString("N2"));
        
        end = true;
      }
    }
  }
}