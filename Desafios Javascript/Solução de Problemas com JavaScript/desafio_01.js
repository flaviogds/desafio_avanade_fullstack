/*
    Desafio 1 - Contagem repetida de números
*/
let n = parseInt(gets());

let array = [];
let newArray = [];

for( i = 0; i < n; i++){
  array.push(parseInt(gets()));
}

array.sort((a, b) => {
    if(a > b){
        return 1;
    }else if(a < b){
        return -1;
    }
    else {
        return 0;
    }
});

while(array.length > 0){
  console.log(array[0] + " aparece " + array.filter(item => item === array[0]).length + " vez(es)");
  array = [...array.filter(item => item !== array[0])];
}

