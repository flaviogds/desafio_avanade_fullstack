/* Desafio 5 - Pedro Bento e o Mundo de OZ */
using System;

class Desafio {
  
  static void Main(string[] args) {
    
    string input = "";
    string[] treasurer = new string[1];
    bool end = false;
    
    while(!end){
      
      input = Console.ReadLine();
      
      if(String.IsNullOrEmpty(input)){
        end = true;
      }
      else{
        if(!Array.Exists(treasurer, jewel => jewel == input)){
          treasurer[(treasurer.Length-1)] = input;
          Array.Resize(ref treasurer, (treasurer.Length+1));
        }
      }
    }
    Console.WriteLine(treasurer.Length-1);
  }
}