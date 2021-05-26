/* Desafio 4 - Teorema da Divisão Euclidiana */

using System; 

class desafio_04 {

    static void Main(string[] args) { 

            string[] valores = Console.ReadLine().Split();
            int valor1 = int.Parse(valores[0]);
            int valor2 = int.Parse(valores[1]);
            int resto, cos;
            
            resto = valor1%valor2;
            cos = valor1/valor2;
            
            if( resto < 0)
            {
              resto = resto + Math.Abs(valor2);
              cos = (valor1 - resto)/valor2;
            }

            Console.WriteLine($"{cos} {resto}");
    }
}