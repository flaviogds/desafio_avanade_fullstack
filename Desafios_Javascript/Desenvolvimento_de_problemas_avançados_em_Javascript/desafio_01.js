/* Desafio 1 - Ordenando Números Pares e Ímpares */

let nEntries = parseInt(gets());
let par = [];
let imp = [];

for(let counter = 0; counter < nEntries; counter++){
  let input = parseInt(gets());
  
  if(input%2 == 0){
    par.push(input);
    
    par.sort((a, b) => {
      if(a < b) return -1;
      if(a > b) return 1;
      if(a == b) return 0;
    });

  }else{
    imp.push(input);
    
    imp.sort((a, b) => {
      if(a < b) return 1;
      if(a > b) return -1;
      if(a == b) return 0;
    });
  }
}

par.forEach(num => console.log(num));
imp.forEach(num => console.log(num));