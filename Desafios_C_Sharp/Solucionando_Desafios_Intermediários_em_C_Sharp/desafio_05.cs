/* Desafio 5 - Fórmula de Bhaskara */

using System; 

class desafio_05 {
    static void Main(string[] args) { 
        double a, b, c, delta, r1, r2;
        string[] valores = Console.ReadLine().Split();

        a = Convert.ToDouble(valores[0]);
        b = Convert.ToDouble(valores[1]);
        c = Convert.ToDouble(valores[2]);

        delta = (Math.Pow(b, 2) - (4 * a * c));

        if (a == 0 || delta < 0)
        {
            Console.WriteLine("Impossivel calcular");
        }
        else
        {
            r1 = (-b + Math.Sqrt(delta)) / (2 * a);
            r2 = (-b - Math.Sqrt(delta)) / (2 * a);
            Console.WriteLine("R1 = {0:0.00000}\nR2 = {1:0.00000}", r1, r2);
        }
    }
}