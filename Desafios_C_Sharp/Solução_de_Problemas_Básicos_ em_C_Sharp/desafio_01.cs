/* Desafio 1 - Visita na Feira*/

using System; 

class desafio_01
{
    static void Main(string[] args)
    { 
      int a, b, x;
      string[] input = Console.ReadLine().split(' ');
      
      a = Convert.ToInt32(input[0]);
      b = Convert.ToInt32(input[1]);

      x = a + b;

      Console.WriteLine("X = {0}", x);

    }

}
