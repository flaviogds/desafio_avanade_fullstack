/* Desafio 2 - Coxinha de Bueno */

let [sneak, peaple] = gets().split(" ").map(input => parseInt(input));

let fraction = sneak / peaple;

console.log(fraction.toFixed(2));
