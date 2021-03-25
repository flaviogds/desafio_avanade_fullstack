/* Desafio 5 - Pedro Bento e o Mundo de OZ */

let input;
let treasurer = [];
let end = false;

while(!end){
  input = gets();
  
  if(input === ""){
    end = true;
  }
  else{
    if(!treasurer.includes(input)){
      treasurer.push(input);
    }
  }
}

console.log(treasurer.length)