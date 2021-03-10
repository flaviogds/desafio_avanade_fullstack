/* Desafio 7 - Barras de ouro */

let paths = [];
let totalDistance = 0;

let [city, load] = gets().split(" ").map(input => parseInt(input));

let taxation = gets().split(" ").map(input => parseInt(input));

for(let counter = 0; counter < city-1; counter++){
  let [cityA, cityB, distance] = gets().split(" ").map(input => parseInt(input));
  
  paths.push( { cityA, cityB, distance } );
}

for( path of paths.reverse() ){
  let travel = 0;
  let routeLength = 0;
  
  if( trueRoute(path) ){
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
  
  if( path.cityB !== 1 ) {
    goldRoute = paths
      .filter(route => route.cityA === 1 || route.cityB === 1)
        .filter(route => route.cityA === path.cityA || route.cityB === path.cityA)
        .length;
  }
  return goldRoute > 0 ? true : false;
}