/*Desafio 2 - Quanta Mandioca? (Solução de problemas com .NET)*/

using System;
using System.Collections.Generic;
class Desafio {
    static void Main() {
  
      Dictionary<string, Dictionary<string, int>> guests = new Dictionary<string, Dictionary<string, int>>();
      
      guests.Add("chico", new Dictionary<string, int>());
          guests["chico"].Add("piece", 300);
          guests["chico"].Add("consume", 0 );
      
      guests.Add("bento", new Dictionary<string, int>());
          guests["bento"].Add("piece", 1500);
          guests["bento"].Add("consume", 0 );
      
      guests.Add("bernardo", new Dictionary<string, int>());
          guests["bernardo"].Add("piece", 600);
          guests["bernardo"].Add("consume", 0 );
      
      guests.Add("marina", new Dictionary<string, int>());
          guests["marina"].Add("piece", 1000);
          guests["marina"].Add("consume", 0 );
      
      guests.Add("iara", new Dictionary<string, int>());
          guests["iara"].Add("piece", 150);
          guests["iara"].Add("consume", 0 );
        
      int host = 225;
      int totalGuests = 0;
      
      foreach( var guest in guests ){
        guests[guest.Key]["consume"] = guests[guest.Key]["piece"] * Int32.Parse(Console.ReadLine());
        totalGuests = totalGuests + guests[guest.Key]["consume"];
      }
      
      int total = host+totalGuests;
      
      Console.WriteLine(total);
    }
}