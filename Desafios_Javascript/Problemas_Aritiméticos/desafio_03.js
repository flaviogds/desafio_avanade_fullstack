/*Desafio 3 - Cálculo de viagem */

let [time, speed] = gets().split(" ").map(input => parseInt(input));

let distance = time*speed;

let income = distance/12;

console.log(income.toFixed(3));

