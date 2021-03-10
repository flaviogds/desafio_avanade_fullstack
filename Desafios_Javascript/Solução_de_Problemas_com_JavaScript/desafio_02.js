/* Desafio 2 - Vogais Extraterrestres */

let end = false;

while(!end){
  let counter = 0
  let code = gets();
  let strg = gets();
  if(code !== ""){
      for(element of code){
        for(letter of strg){
          if(element === letter){
            counter++;
          }
        }
    }
    console.log(counter)
  }
  else{
    end = true;
  }
}