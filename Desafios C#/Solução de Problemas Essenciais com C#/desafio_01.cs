/*

    Desafio 1 - Quadrado e ao Cubo

*/
using System;

class Desafio {
    static void Main() {
        int n = Int32.Parse(Console.ReadLine());

        for(int i = 1; i <= n; i++ ){
          int quadrado = i * i;
          int cubo = i * i * i;
          Console.WriteLine(i.ToString()+" "+quadrado.ToString()+" "+cubo.ToString());
        }
    }
}