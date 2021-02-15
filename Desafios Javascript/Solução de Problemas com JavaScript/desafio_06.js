/*
    Desafio 6 - Produto e divisão
*/

let result = 1
let n = parseInt(gets());

for(let i = 0; i < n; i++){
  let [num, operator] = gets().split(' ');

  num = parseInt(num);

  if(Math.abs(num) < 10){
    if(operator==='*'){
      result = result * num;
    }
    else if(operator==='/' && parseInt(num) !== 0){
      result = result / num;
    }
  }
}
console.log(result);