/* Desafio 4 - Entrevista embaraçosa */

let strgsList = [];
let input = "";
let exit = false;

while(!exit){
  input = gets();
  input !== '' ? strgsList.push(input) : exit = true;
}

for(let counterSTR = 0; counterSTR < strgsList.length; counterSTR++){
  let read = strgsList.shift();

  while(read != null){
    read = read.trim();
    if(read.length > 0 && read.length <= 30){
      let result = rectify(read);
      for(let counterSUB = result.length - 1; counterSUB >= 0; counterSUB--){
          console.log(result[counterSUB]);
      }
    }
    read = strgsList.shift();
  }
}

function rectify(strg){
  let deconstruct = strg.split('');
  let control = deconstruct.length - 1;
  let length = deconstruct.length;
  let position = -1;
  let result = [];
  let subStrg = "";
  let path;
  let end = false;

  subStrg = deconstruct[control] + subStrg;

  while (length >= 0 && !end) {
    length = control - subStrg.length;
    
    if (length >= 0) {
        path = strg.substring(control - subStrg.length, control);
        if (path == subStrg){
            result.push(strg.substring(0, control));
            position = control;
        }
        control--;
        
        control >= 0 ? subStrg = deconstruct[control] + subStrg : null;
    }
    else {
        end = true;
    }
  }
  position == -1 ? result.push(strg) : null;
  
  return result;
}