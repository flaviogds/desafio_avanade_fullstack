/* Desafio 5 - Comunicação em Piralândia */

using System; 

class desafio_05
{
  static void Main(string[] args)
  { 
    string strng = Console.ReadLine();

    string converted = "";

    for (int index = strng.Length - 1; index >= 0; index--)
    {
      converted += strng[index];
    }
    Console.WriteLine(converted);
  }
}