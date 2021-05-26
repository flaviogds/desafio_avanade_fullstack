/* Desafio 3 - Pink e Cérebro */

using System; 

class desafio_03 {

    static void Main(string[] args) { 

        int sequencia = int.Parse(Console.ReadLine());

        string[] n = Console.ReadLine().Split();
        
        int mult2 = 0;
        int mult3 = 0;
        int mult4 = 0;
        int mult5 = 0;

      
            for(var i = 0; i < sequencia; i++)
            {
              int valor = int.Parse(n[i]);
              mult2 += valor%2==0 ? 1 : 0;
              mult3 += valor%3==0 ? 1 : 0;
              mult4 += valor%4==0 ? 1 : 0;
              mult5 += valor%5==0 ? 1 : 0;
            }
            
            Console.WriteLine("{0} Multiplo(s) de 2", mult2);
            Console.WriteLine("{0} Multiplo(s) de 3", mult3);
            Console.WriteLine("{0} Multiplo(s) de 4", mult4);
            Console.WriteLine("{0} Multiplo(s) de 5", mult5);

    }

}