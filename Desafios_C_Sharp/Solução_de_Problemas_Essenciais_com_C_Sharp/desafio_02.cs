/* Desafio 2 - A Corrida de Tartarugas */
using System;

class Desafio {
    static void Main(string[] args) {
    
    bool end = false;
    
    do{
      string input = Console.ReadLine();
  
      if(string.IsNullOrEmpty(input))
      {
        end = true;
      }
      else
      {
        int length = Int32.Parse(input);
        
        string[] array = Console.ReadLine().Split(' ');

        int[] turtles = Array.ConvertAll(array, Int32.Parse);
        
        int maxSpeed  = 0;
        
        foreach(int turtle in turtles)
        {
          if(turtle > maxSpeed ){
            maxSpeed  = turtle;
          }
        }

        if(maxSpeed < 10)
        {
            Console.WriteLine(1);
        }
        else if(maxSpeed >= 10 && maxSpeed < 20)
        {
            Console.WriteLine(2);
        }
        else if(maxSpeed >= 20)
        {
            Console.WriteLine(3);
        }
      }
    }
    while(!end);
  }
}