/* Desafio 1 - Coordenadas de um Ponto */

using System; 

class desafio_01 {
    public static void Main(string[] args) { 
      double[] input = Array.ConvertAll(Console.ReadLine().Split(), s => double.Parse(s));
      
      int posX = input[0] == 0 ? 0 : (int)(input[0]/Math.Abs(input[0]));
      
      int posY = input[1] == 0 ? 0 : (int)(input[1]/Math.Abs(input[1]));
      
      string quadrante = Quad($"({posX}, {posY})");
      
      Console.WriteLine(quadrante);
    }
    
    private static string Quad(string point){
      switch(point) {
        case "(1, 1)":
          return "Q1";
        case "(-1, 1)":
          return "Q2";
        case "(-1, -1)":
          return "Q3";
        case "(1, -1)":
          return "Q4";
        case "(1, 0)":
          return "Eixo X";
        case "(-1, 0)":
          return "Eixo X";
        case "(0, 1)":
          return "Eixo Y";
        case "(0, -1)":
          return "Eixo Y";
        default:
          return "Origem" ;
      }
    }

}