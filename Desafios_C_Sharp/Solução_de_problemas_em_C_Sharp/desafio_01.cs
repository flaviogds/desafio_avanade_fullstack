/* Desafio 1 - Consumo Médio do Automóvel */

using System; 

class desafio_01 {

    static void Main(string[] args) { 

            int distancia;
            double combustivelGasto, consumoMedio;

            distancia = Convert.ToInt32(Console.ReadLine());
            combustivelGasto = Convert.ToDouble(Console.ReadLine());

            consumoMedio = (double)distancia/combustivelGasto; 

            Console.WriteLine("{0:0.000} km/l", consumoMedio);

    }

}