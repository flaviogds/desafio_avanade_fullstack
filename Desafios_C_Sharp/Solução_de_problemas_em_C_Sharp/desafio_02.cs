/* Desafio 2 - DDD */

using System; 

class desafio_02 {

    static void Main(string[] args) { 

            int ddd = Convert.ToInt32(Console.ReadLine());

            string local = Exists(ddd);
            
            Console.WriteLine(local);
    }
    
    private static string Exists(int number) {
        switch (number) {
        case 11:
            return "Sao Paulo";
        case 19:
            return "Campinas";
        case 21:
            return "Rio de Janeiro";
        case 27:
            return "Vitoria";
        case 31:
            return "Belo Horizonte";
        case 32:
            return "Juiz de Fora";
        case 61:
            return "Brasilia";
        case 71:
            return "Salvador";
        default:
            return "DDD nao cadastrado";
        }
    }

}