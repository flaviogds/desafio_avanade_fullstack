/* Desafio 6 - Produto e divisão */

let result;
let nInteractions;
let end = false;

while(!end){
  result = 1;
  
  nInteractions = parseInt(gets());
  
  if(nInteractions !== '' && nInteractions >= 1 && nInteractions <= 1000000){
    for(let i = 0; i < nInteractions; i++ ){
      let [number, operator] = gets().split(' ');
    
      number = parseInt(number);
      
      if(operator === '*'){
        if(Number(result) * Number(number) >= Number.MAX_SAFE_INTEGER){
          result = BigInt(result) * BigInt(number);
        }else{
          result *= number;
        }
      }
      else if(operator === '/' && number !== 0){
        if(Number(result) / Number(number) >= Number.MAX_SAFE_INTEGER){
          result = BigInt(result) / BigInt(number);
        }else{
          result /= number;
        }
      }
    }
    console.log(typeof result == 'bigint' ? result.toString() : parseInt(result))
  }
  else{
    end = true;
  }
}






