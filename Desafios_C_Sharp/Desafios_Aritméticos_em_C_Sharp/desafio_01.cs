/* Desafio 1 - Média 1 */

using System; 

class desafio_01
{
    static void Main(string[] args) { 
        double valueA, valueB, mediaP;

        valueA = Convert.ToDouble(Console.ReadLine());
        valueB = Convert.ToDouble(Console.ReadLine());
        
        mediaP = (( valueA * 3.5) + ( valueB * 7.5)) / (3.5 + 7.5);

        Console.WriteLine("MEDIA = {0}", mediaP.ToString("0.00000"));
    }
}