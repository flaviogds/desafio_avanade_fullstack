/* Desafio 3 -  Degustação de vinho*/

let n = gets();

let array = gets().split(' ');

let result = array.filter(wine => wine === n);

console.log(result.length);