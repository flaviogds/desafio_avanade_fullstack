/* Desafio 5 - Menor e Posição */

let n = gets();
let value;
let position = 0;

let array = gets().split(' ').map(num => parseInt(num));

value = [...array];

value = value.reduce((acc, cur) => Math.min(cur, acc));

position = array.indexOf(value)

console.log(`Menor valor: ${value} \nPosicao: ${position}`);