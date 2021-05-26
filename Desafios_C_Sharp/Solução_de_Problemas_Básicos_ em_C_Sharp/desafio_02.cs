/* Desafio 2 - Tuitando*/

using System; 

class desafio_02 {
    static void Main(string[] args)
    { 
        string input = Console.ReadLine();
            char[] arr = input.ToCharArray();
            if( arr.Length <= 140 )
                Console.WriteLine("TWEET");
            else
                Console.WriteLine("MUTE");

    }

}
