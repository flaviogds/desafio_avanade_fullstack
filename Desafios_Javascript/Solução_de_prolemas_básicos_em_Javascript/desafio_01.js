/* Desafio 1 -  Dividindo X por Y */

let nInputs = parseInt(gets());

for (let counter = 0; counter < nInputs; counter++) {
    
    let [numerator, denominator] = gets().split(" ").map(input => parseInt(input));
    
    if (denominator == 0) {
        console.log("divisao impossivel");
    } else {
        let division = parseFloat(numerator / denominator).toFixed(1);
        console.log(division);
    }
}