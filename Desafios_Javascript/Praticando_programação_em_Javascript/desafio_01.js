/* Desafio 1 - Quanta Mandioca? */

let guests = {
  chico: { piece: 300, consume: 0 },
  bento: { piece: 1500, consume: 0 },
  bernardo: { piece: 600, consume: 0 },
  marina: { piece: 1000, consume: 0 },
  iara: { piece: 150, consume: 0 }
}

let host = 225;
let totalGuests = 0;

for(guest in guests){
  guests[guest].consume = guests[guest].piece * parseInt(gets());
  totalGuests += guests[guest].consume;
}

let total = host+totalGuests;

console.log(total);