/* Desafio 3 - Ultrapassando V */
using System;

class Desafio {
    static void Main(string[] args) {
    
    int r = Int32.Parse(Console.ReadLine());
    int v = 0;
    
    while(v <= r)
    {
      v = Int32.Parse(Console.ReadLine());
    }
    
    int soma = 0;
    int count = 0;
    
    for(soma = 0; soma <= v; r++, count ++ )
    {
      soma += r;
    }
    Console.WriteLine(count);
  }
}
