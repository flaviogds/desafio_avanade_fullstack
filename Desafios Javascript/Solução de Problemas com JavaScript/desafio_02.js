
/*
    Desafio 2 - Vogais Extraterrestres
*/

let end = false;

while(!end){
  let count = 0
  let code = gets();
  let strg = gets();
  if(code !== ""){
      for(element of code){
        for(letter of strg){
          if(element === letter){
            count++;
          }
        }
    }
    console.log(count)
  }
  else{
    end = true;
  }
}