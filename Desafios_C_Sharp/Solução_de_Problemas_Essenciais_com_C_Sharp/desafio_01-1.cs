/* Desafio 1 - Programa para Validação de Notas (Solução de problemas com .NET)*/

using System;

class Desafio
{
    static void Main(string[] args)
    {
        bool end = false;

        while (!end)
        {
            Calc();
            
            end = Continue();
        }
    }

    private static bool Continue()
    {
        while (true)
        {
            Console.WriteLine("novo calculo (1-sim 2-nao)");

            string response = Console.ReadLine();

            switch (response)
            {
                case "1":
                    return false;
                case "2":
                    return true;
                default:
                    continue;
            }
        }
    }

    private static void Calc()
    {
        float sum = 0;
        float media = 0;
        int counter = 0;

        while (true)
        {
            float input = float.Parse(Console.ReadLine());

            if (input >= 0 && input <= 10)
            {
                sum += input;
                counter++;

                if (counter == 2)
                {
                    media = sum / 2;

                    Console.WriteLine("media = " + media.ToString("N2"));

                    break;
                }
            }
            else
            {
                Console.WriteLine("nota invalida");
            }
        }
    }
}