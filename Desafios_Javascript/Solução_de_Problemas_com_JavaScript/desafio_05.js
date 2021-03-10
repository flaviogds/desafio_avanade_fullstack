/* Desafio 5 - Conjuntos bons ou ruins? */

let nEntries = parseInt(gets());
let strgList = [];
let exit = 0;

const findPrefix = (fix, strg) => strg.startsWith(fix);

do {
  for (let counter = 0; counter < nEntries; counter++) {
    let str = gets();
    strgList.map(word => {
      if (word.length < str.length) {
        findPrefix(word, str) && exit++;
      } else {
        findPrefix(str, word) && exit++;
      }
    });
    strgList.push(str);
  }
  if (exit > 0) {
    console.log(`Conjunto Ruim`);
  } else {
    console.log(`Conjunto Bom`);
  }
  exit = 0;
  strgList = [];
  nEntries = parseInt(gets());
} while (nEntries !== 0);