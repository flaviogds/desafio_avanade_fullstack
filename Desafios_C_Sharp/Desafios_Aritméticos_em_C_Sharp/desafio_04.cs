/* Desafio 1 - Tempo de um evento */

using System;
using System.Globalization;

class desafio_04
{
    static void Main(string[] args)
    {
        string dataInit = Console.ReadLine().Replace("Dia ", "").Trim();
        string HourInit = Console.ReadLine().Replace(" ", "");
        string dataEnd = Console.ReadLine().Replace("Dia ", "").Trim();
        string HourEnd = Console.ReadLine().Replace(" ", "");
        
        string start = dataInit + " " + HourInit;
        string end = dataEnd + " " +HourEnd;
        
        DateTime timeStart = DateTime.ParseExact(start, "d H:m:s", CultureInfo.InvariantCulture);
        DateTime timeEnd = DateTime.ParseExact(end, "d H:m:s", CultureInfo.InvariantCulture);
        
        TimeSpan diff = timeEnd - timeStart;

        Console.WriteLine("{0:%d} dia(s)\n{0:%h} hora(s)\n{0:%m} minuto(s)\n{0:%s} segundo(s)\n", diff);
    }
}