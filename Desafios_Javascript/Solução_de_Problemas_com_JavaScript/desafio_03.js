/* Desafio 3 - Melhor amigo do Pablo */

let list = [];
let index = 0;
let winner ='';
let exit = false;

while(!exit){
  input = gets();

  if(input === "FIM"){
    exit = true;
  }
  else{
    list.push({
      name: input.split(" ")[0],
      answer: input.split(" ")[1],
      index
    });
  }
  index++;
}

list.map(input => {
  if(list.filter(obj => obj.name === input.name).length >> 1){
    list = [...list.filter(obj => obj.name !== input.name), input];
  }
})

list.sort((a, b) => {
    if(a.name < b.name){
      return -1;
    }
    else if(a.name > b.name){
      return 1;
    }
    else{
      return 0;
    }
  });
  
list.map(student => {
  if(student.answer === "SIM"){
    if(winner === ''){
      winner = student;
    }
    else if(student.name.length > winner.name.length){
      winner = student;
    }
    else if(student.name.length === winner.name.length){
      if(winner.index > student.index){
        winner = student;
      }
    }
  }
});

list.map(input => input.answer === "SIM" ? console.log(input.name) : null );
list.map(input => input.answer === "NAO" ? console.log(input.name) : null );
console.log(`\nAmigo do Pablo:\n${winner.name}`);
