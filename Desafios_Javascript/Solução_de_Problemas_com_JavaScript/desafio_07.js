/*
    Desafio 7 - Barras de ouro
*/
let [city, load]  = gets().split(" ").map(m => parseInt(m));
let taxation = gets().split(" ").map(m => parseInt(m));
let paths = [];

for(let i = 0; i < city-1; i++){
  let [a, b, c] = gets().split(" ").map(m => parseInt(m));
  paths.push( { cityA: a, cityB: b, distance: c } );
}

let totalDistance = 0;

for(path of paths.reverse()){
  let travel = 0;
  let routeLength = 0;
  
  if(trueRoute(path)){
    travel = Math.ceil(taxation[path.cityB - 1] / load);
    taxation[path.cityA - 1] += taxation[path.cityB - 1];
    taxation[path.cityB - 1] = 0;
  }else{
    travel = Math.ceil(taxation[path.cityA - 1] / load);
    taxation[path.cityB - 1] += taxation[path.cityA - 1];
    taxation[path.cityA - 1] = 0;
  }
  routeLength = 2 * path.distance * travel;
  totalDistance += routeLength;
}

console.log(totalDistance);

function trueRoute(path){
  let goldRoute = -1;
  if(path.cityB !== 1) {
    goldRoute = paths
      .filter(a => a.cityA === 1 || a.cityB === 1)
        .filter(b => b.cityA === path.cityA || b.cityB === path.cityA)
        .length;
  }
  return goldRoute > 0 ? true : false;
}