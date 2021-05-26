/* Desafio 3 - Notas e Moedas */

using System; 
using System.Collections.Generic;

class desafio_03 {
    static void Main(string[] args) {
      Dictionary<string, int> notas = new Dictionary<string, int>();
      Dictionary<string, int> moedas = new Dictionary<string, int>();
    
        notas.Add("nota_100", 100);
        notas.Add("nota_50", 50);
        notas.Add("nota_20", 20);
        notas.Add("nota_10", 10);
        notas.Add("nota_5", 5);
        notas.Add("nota_2", 2);

        moedas.Add("moeda_1", 100);
        moedas.Add("moeda_05", 50);
        moedas.Add("moeda_025", 25);
        moedas.Add("moeda_010", 10);
        moedas.Add("moeda_005", 5);
        moedas.Add("moeda_001", 1);

        int inteiro, resto;
        
        double valor = Convert.ToDouble(Console.ReadLine());
        
        inteiro = (int)valor;
        resto = (int)(valor * 100) - (inteiro * 100);
        
        Console.WriteLine("NOTAS:");
        foreach(KeyValuePair<string, int> nota in notas)
        {
            int n = inteiro / nota.Value;
            
            Console.WriteLine($"{n} nota(s) de R$ {nota.Value}.00");
            
            inteiro = inteiro % nota.Value;
        }
        
        resto += (inteiro * 100);
        
        Console.WriteLine("MOEDAS:");
        foreach(KeyValuePair<string, int> moeda in moedas)
        {
            int n = resto / moeda.Value;
            
            string valorMoeda = string.Format("{0:0.00}", (double)moeda.Value/100);
            
            Console.WriteLine($"{n} moeda(s) de R$ {valorMoeda}");
            resto = resto % moeda.Value;
        }
    }
}