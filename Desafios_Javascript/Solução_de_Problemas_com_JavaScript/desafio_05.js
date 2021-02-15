/*
    Desafio 5 - Conjuntos bons ou ruins?
*/
let n = parseInt(gets());
let strgList = [];
let exit = 0;

const findPrefix = (fix, strg) => {
  return strg.startsWith(fix);
}

do {
  for (let i = 0; i < n; i++) {
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
  n = parseInt(gets());
} while (n !== 0);