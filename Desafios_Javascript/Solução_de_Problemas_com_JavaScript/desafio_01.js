/* Desafio 1 - Contagem repetida de números */

let nEntries = parseInt(gets());
let arrayInput = [];

for( let counter = 0; counter < nEntries; counter++){
  arrayInput.push(parseInt(gets()));
}

arrayInput.sort((a, b) => {
    if(a > b) return 1;
    else if(a < b) return -1;
    else return 0;
});

while(arrayInput.length > 0){
  console.log(arrayInput[0] + " aparece " + arrayInput.filter(item => item === arrayInput[0]).length + " vez(es)");
  arrayInput = [...arrayInput.filter(item => item !== arrayInput[0])]
}