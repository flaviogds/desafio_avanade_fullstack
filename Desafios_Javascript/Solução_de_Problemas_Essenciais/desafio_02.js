let group;
let array;
let end = false;

while(!end){
  group = gets();
  
  if(group === ""){
    end = true
  }
  else{
    array = gets().split(" ").map(a => parseInt(a));
    
    let max = array.reduce((a, b) => Math.max(a, b))
    
    if(max < 10){
      console.log(1);
    }else if(max >= 10 && max < 20){
      console.log(2);
    }else{
      console.log(3);
    }
  }
}