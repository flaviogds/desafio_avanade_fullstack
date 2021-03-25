/* Desafio 2 - Bazinga! (Introdução a programação com .NET)*/

using System; 

class Desafio {
    static void Main(string[] args)
    { 
        int nEntries = int.Parse(Console.ReadLine());

        for (int nCase = 1; nCase <= nEntries ; nCase++)
        {
            string[] input = Console.ReadLine().Split(" ");
            
            bool winner = Winner(input);

            if(winner)
            {
                 Console.WriteLine($"Caso #{nCase}: Bazinga!");
            }
            else if(!winner && input[0] != input[1])
            {
                Console.WriteLine($"Caso #{nCase}: Raj trapaceou!");
            }
            else
            {
                Console.WriteLine($"Caso #{nCase}: De novo!");
            }
        }
    }

    private static bool Winner(String[] players)
    {
        string[] lagarto = new string[2] {"papel", "Spock"};
        string[] papel = new string[2] {"Spock", "pedra"};
        string[] pedra = new string[2] {"tesoura", "lagarto"};
        string[] spock = new string[2] {"pedra", "tesoura"};
        string[] tesoura = new string[2] {"papel", "lagarto"};
      
        switch (players[0])
        {
            case "lagarto":
                return Array.Exists(lagarto, hand => hand == players[1]);
                break;
            case "papel":
                return Array.Exists(papel, hand => hand == players[1]);
                break;
            case "pedra":
                return Array.Exists(pedra, hand => hand == players[1]);
                break;
            case "Spock":
                return Array.Exists(spock, hand => hand == players[1]);
                break;
            case "tesoura":
                return Array.Exists(tesoura, hand => hand == players[1]);
                break;
            default:
                return false;
        }
    }
}