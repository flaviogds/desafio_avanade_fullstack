/* Desafio 2 - Triângulo */

using System; 

class desafio_02 {
    static void Main(string[] args) { 
        double a, b, c;
        string[] valor = Console.ReadLine().Split();
        a = Convert.ToDouble(valor[0]);
        b = Convert.ToDouble(valor[1]);
        c = Convert.ToDouble(valor[2]);

        if((a + b > c) && (a + c > b) && ( b + c > a))
        {
            double perimeter = a + b + c;
            Console.WriteLine("Perimetro = {0:0.0}", perimeter);
        }
        else
        {
            double area = ((a + b) *c)/2;
            Console.WriteLine("Area = {0:0.0}", area);
        }
    }
}