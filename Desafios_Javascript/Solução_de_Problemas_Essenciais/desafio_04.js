/* Desafio 4 - Validação de Nota */

let array = [];
let end = false;

while(!end){
  let input = parseFloat(gets());
  if(input >= 0 && input <=10){
    array.push(input);
  }
  else{
    console.log('nota invalida')
  }
  if(array.length === 2){
    let media = array.reduce((a, b) => (a+b)/2);
    console.log(`media = ${media.toFixed(2)}`);
    
    end = true;
  }
};