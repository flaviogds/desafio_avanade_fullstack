/*

    Desafio 5 - Pedro Bento e o Mundo de OZ

*/
using System;

class Program {
  
  static void Main(string[] args) {
    
    string input = "";
    string[] bau = new string[1];
    bool end = false;
    
    while(!end){
      
      input = Console.ReadLine();
      
      if(String.IsNullOrEmpty(input)){
        end = true;
      }
      else{
        if(!Array.Exists(bau, item => item == input)){
          bau[(bau.Length-1)] = input;
          Array.Resize(ref bau, (bau.Length+1));
        }
      }
    }
    Console.WriteLine(bau.Length-1);
  }
}