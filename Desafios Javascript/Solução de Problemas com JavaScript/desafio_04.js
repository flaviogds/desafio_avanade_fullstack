/*
    Desafio 4 - Entrevista embaraçosa
*/

let strgsList = [];
let input = "";
let exit = false;

while(!exit){
  input = gets();
  
  if(input !== ''){
    strgsList.push(input);
  }
  else{
    exit = true
  }
}

for(let i = 0; i < strgsList.length; i++){
  let read = strgsList.shift();

  while(read != null){
    read = read.trim();
    if(read.length > 0 && read.length <= 30){
      let result = rectify(read);
      for(let i = result.length - 1; i >= 0; i--){
          console.log(result[i]);
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
        if (control >= 0) {
            subStrg = deconstruct[control] + subStrg;
        }
    }
    else {
        end = true;
    }
  }
  if (position == -1) {
      result.push(strg);
  }
  return result;
}