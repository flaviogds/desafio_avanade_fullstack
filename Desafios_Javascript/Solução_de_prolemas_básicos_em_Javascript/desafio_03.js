/* Desafio 3 - Tipo de Combustível */

let end = false;
let input = 0;

let fuel = {
  alcohol: 0,
  gasoline: 0,
  diesel: 0,
}

while(!end) {
  input = parseInt(gets());
  
  switch(input) {
    case 1:
      fuel.alcohol++;
      break;
    case 2:
      fuel.gasoline++;
      break;
    case 3:
      fuel.diesel++;
      break;
    case 4:
      end = true;
      break;
    default:
      end = false;
      break;
  }
}

console.log("MUITO OBRIGADO");
console.log("Alcool: " + fuel.alcohol);
console.log("Gasolina: " + fuel.gasoline);
console.log("Diesel: " + fuel.diesel);