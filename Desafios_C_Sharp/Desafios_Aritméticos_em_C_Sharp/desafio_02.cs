/* Desafio 2 - Crescimento Populacional */

using System; 

class desafio_02
{
    static void Main(string[] args)
    { 
        int cases = Convert.ToInt32(Console.ReadLine());
        int popA, popB, years;
        double coefPopA, coefPopB;

        for (int i = 0; i < cases; i++)
        {
            years = 0;
            string[] input = Console.ReadLine().Split();
            popA = int.Parse(input[0]);
            popB = int.Parse(input[1]);
            coefPopA = double.Parse(input[2]);
            coefPopB = double.Parse(input[3]);

            while (popA <= popB)
            {
                popA += (int)((double)popA * (coefPopA / 100));
                popB += (int)((double)popB * (coefPopB / 100));
                years++;
                
                if (years > 100)
                {
                    Console.WriteLine("Mais de 1 seculo.");
                    break;
                }
            }

            if (years <= 100)
            {
                Console.WriteLine($"{years} anos.");
            }
        }
    }
}