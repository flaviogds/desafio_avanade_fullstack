/* Desafio 2 - Blobs */

let nEntries = parseInt(gets());

for( let counter = 0; counter < nEntries; counter++){
  let supply = parseFloat(gets());
  let days = 0;
  
  while(supply > 1){
    supply = supply/2;
    days++;
  }
  
  console.log(`${days} dias`);
}