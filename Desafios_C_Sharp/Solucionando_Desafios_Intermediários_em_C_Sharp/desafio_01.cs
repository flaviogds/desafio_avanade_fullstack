/* Desafio 1 - Teste de Seleção 1 */

using System; 

class desafio_01 {
    static void Main(string[] args) { 
        string [] selections = Console.ReadLine().Split(' ');
        int A = int.Parse(selections[0]);
        int B = int.Parse(selections[1]);
        int C = int.Parse(selections[2]);
        int D = int.Parse(selections[3]);

        if ( (A%2 != 0) || (C < 0 || D < 0) || (B < C || A > D) || ((A + B) > (C + D)))
        {
          Console.WriteLine("Valores nao aceitos");
        }
        else
        {
          Console.WriteLine("Valores aceitos");
        }
    }
}