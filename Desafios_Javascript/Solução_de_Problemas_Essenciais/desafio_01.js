/* Desafio 1 - Quadrados e a Cubo */

let input = parseInt(gets());

for(let element = 1; element <= input; element++ ){
  let square = element * element;
  let cube = square * element;
  
  console.log(element+" "+square+" "+cube);
}