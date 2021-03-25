/*Desafio 4 - Validador de senhas com requisitos (Solução de problemas com .NET)*/

using System;
using System.Text.RegularExpressions;
using System.Collections.Generic;

class Desafio
{
    public static void Main(string[] args)
    {
        bool end = false;
        string input = "";

        Regex length = new Regex(@"[\w+]{6,32}");
        Regex special = new Regex(@"[\s\!@#$%¨&*()_+<>:?^`,;~´\u002E]");
        Regex upper = new Regex(@"[A-Z]");
        Regex lower = new Regex(@"[a-z]");
        Regex number = new Regex(@"[0-9]");

        List<Regex> pattern = new List<Regex> { length, special, upper, lower, number };

        while (!end)
        {
            input = Console.ReadLine();

            if (!String.IsNullOrEmpty(input))
            {
                bool passwd = valid(pattern, input);
                Console.WriteLine(passwd ? "Senha valida." : "Senha invalida.");
            }
            else end = true;
        }
    }
    private static bool valid(List<Regex> pattern, string input)
    {
        foreach (Regex rgx in pattern)
        {
            bool validation = rgx.IsMatch(input);

            if (rgx.IsMatch(" ") && validation) return false;
            else
            {
                if (!rgx.IsMatch(" ") && !validation) return false;
            }
        }
        return true;
    }
}