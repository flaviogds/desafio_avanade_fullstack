/*

    Desafio 4 - Validação de Nota

*/

using System;

class Desafio {
    static void Main() {
    
    float soma = 0;
    int count = 0;
    bool end = false;
    
    while(!end){
      float input = float.Parse(Console.ReadLine());
      
      if(input >= 0 && input <=10){
        soma += input;
        count++;
      }
      else{
        Console.WriteLine("nota invalida");
      }
      if(count == 2){
        float media = (soma/2);
        
        Console.WriteLine("media = " + media.ToString("N2"));
        
        end = true;
      }
    }
  }
}