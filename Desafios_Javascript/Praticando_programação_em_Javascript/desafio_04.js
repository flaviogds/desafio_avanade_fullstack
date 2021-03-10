/* Desafio 4 - Contagem de Cédulas */

let value = parseInt(gets());

let newValue = value;

let loot = {
  note_100: { lootQuote: 0, value: 100 },
  note_50: { lootQuote: 0, value: 50 },
  note_20: { lootQuote: 0, value: 20 },
  note_10: { lootQuote: 0, value: 10 },
  note_5: { lootQuote: 0, value: 5 },
  note_2: { lootQuote: 0, value: 2 },
  note_1: { lootQuote: 0, value: 1 },
}

for(note in loot){
  loot[note].lootQuote = newValue/loot[note].value;
  newValue = newValue%loot[note].value;
}

console.log(value);

for(quote in loot){
  console.log(`${parseInt(loot[quote].lootQuote)} nota(s) de R$ ${loot[quote].value},00`);
}