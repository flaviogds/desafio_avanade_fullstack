/* Desafio 3 Ultrapassando V */

let r = parseInt(gets());
let v = 0;

while(v <= r){
  v = parseInt(gets());
}

let sum = 0;
let counter = 0;

for(sum = 0; sum <= v; r++, counter ++ ){
  sum += r;
}

console.log(counter);