/* Desafio 5 - Teorema da Divisão Euclidiana */

let [value1, value2] = gets().split(" ").map(input => parseInt(input));

let rest = value1%value2;
let cos = value1/value2

if(rest < 0){
  rest = rest + Math.abs(value2);

  cos = (value1 - rest)/value2;
}

console.log(cos.toFixed(0)+" "+rest);
