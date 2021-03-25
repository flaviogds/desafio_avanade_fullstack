/* Desafio 4 - Taxa de Imposto de Renda */

let entrada = parseFloat(gets());
let imposto = 0;

if(entrada > 4500){
  imposto += (entrada - 4500)*0.28;
  entrada = 4500;
}
if(entrada > 3000){
  imposto += (entrada-3000)*0.18;
  entrada = 3000;
}
if(entrada > 2000){
  imposto += (entrada-2000)*0.08;
  entrada = 2000;
}

imposto === 0 ? console.log(`Isento`) : console.log(`R$ ${imposto.toFixed(2)}`);