/* Desafio 2 - Votação para Bobo da Corte */

let n = parseInt(gets());
let vote = [];

for(var i = 0; i < n; i++){
  vote[i] = (parseInt(gets()));
}

if(vote[0] < Math.max(...vote.slice(1,vote.length-1))){
  console.log('N');
}else{
  console.log('S');
}