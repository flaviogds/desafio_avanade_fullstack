/* Desafio 3 - Compras no Supermercado */

let nEntries = parseInt(gets());
let listas = [];

for(let counter = 0; counter < nEntries; counter++){
  
  let input = gets().split(" ").sort((a, b) => {
      if(a < b) return -1;
      if(a > b) return 1;
      if(a == b) return 0;
    });
    
  input.forEach(item => input = [...input.filter(element => element !== item), item])
    
  listas.push(input);
}

for(lista of listas){
  console.log(lista.join(' '));
}