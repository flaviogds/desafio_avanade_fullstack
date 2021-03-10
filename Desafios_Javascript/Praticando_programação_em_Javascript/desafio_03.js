/* Desafio 3 - Comunicação em Piralândia */

let input = gets();
let reverse = '';

for(let index = input.length-1; index >= 0; index--){
  reverse += input[index]
}

console.log(reverse);

/*A solução abaixo é analoga.

  let input = gets().split('').reverse().join('');
  console.log(input);
*/