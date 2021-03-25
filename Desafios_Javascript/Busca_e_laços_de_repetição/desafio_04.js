/* Desafio 4 - Pink e Cérebro */

let n = gets();

let array = gets().split(' ').map(num => parseInt(num));

for(let base = 2; base <= 5; base++){
  let result = array.filter(num => num % base === 0)
  
  console.log(`${result.length} Multiplo(s) de ${base}`);
}