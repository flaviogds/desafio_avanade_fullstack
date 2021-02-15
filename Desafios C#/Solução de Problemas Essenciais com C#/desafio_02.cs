/*

  Desafio 2 - A Corrida de Tartarugas

*/
using System;

class Desafio {
    static void Main() {
    
    bool end = false;
    
    do{
      string n = Console.ReadLine();
  
      if(string.IsNullOrEmpty(n)){
        end = true;
      }
      else{
        int length = Int32.Parse(n);
        
        string[] array = Console.ReadLine().Split(' ');

        int[] turtles = Array.ConvertAll(array, Int32.Parse);
        
        int max = 0;
        
        foreach(int turtle in turtles){
          if(turtle > max){
            max = turtle;
          }
        }

        if(max<10){
            Console.WriteLine(1);
        }
        else if(max>=10 && max<20){
            Console.WriteLine(2);
        }else if(max>=20){
            Console.WriteLine(3);
        }
      }
    }while(!end);
  }
}