using System;
using System.Linq;

class Desafio
{
    public static void Main()
    {
        int nEntries = Int32.Parse(Console.ReadLine());

        for (int nCases = 0; nCases < nEntries; nCases++)
        {
            int nClient = Int32.Parse(Console.ReadLine());

            int[] message = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();

            int orderClient = ReOrder(message);

            Console.WriteLine(orderClient);
        }
    }

    private static int ReOrder(int[] array)
    {
        int[] newOrder = new int[array.Length];

        array.CopyTo(newOrder, 0);

        int client = 0;

        Array.Sort(newOrder);
        Array.Reverse(newOrder);

        for(int position = 0; position < array.Length; position++)
        {
            if(newOrder[position] == array[position]) client++;
        }

        return client;
    }
}