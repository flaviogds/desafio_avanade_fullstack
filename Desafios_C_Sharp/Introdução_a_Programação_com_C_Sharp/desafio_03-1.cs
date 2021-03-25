/* Desafio 3 - Coxinha de Bueno (Introdução a programação com .NET)*/

using System; 

class Desafio {
    static void Main(string[] args)
    {
        string[] input = Console.ReadLine().Split(" ");
        
        double sneak = double.Parse(input[0]);
        double peaple = double.Parse(input[1]);

        double fraction = sneak / peaple;

        Console.WriteLine(fraction.ToString("N2"));
    }
}