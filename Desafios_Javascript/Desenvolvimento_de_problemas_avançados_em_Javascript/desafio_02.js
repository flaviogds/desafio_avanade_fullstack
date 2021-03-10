/* Desafio 2 - Animal */

let data = {
    'vertebrado': {
      'ave': { 'carnivoro': 'aguia', 'onivoro': 'pomba' },
      'mamifero': { 'onivoro': 'homem', 'herbivoro': 'vaca' }
    },
    'invertebrado': {
      'inseto': { 'hematofago': 'pulga', 'herbivoro': 'lagarta' },
      'anelideo': { 'hematofago': 'sanguessuga', 'onivoro': 'minhoca' }
    }
  }
  
  let espec = {
    subfilo: '',
    classe:'',
    ordem:''
  }
  
  espec.subfilo = gets();
  espec.classe = gets();
  espec.ordem = gets();
  
  let subfilo = search(data, espec.subfilo);
  
  if(subfilo !== null){
    let classe = search(subfilo, espec.classe);
    
    if(classe !== null){
      let ordem = search(classe, espec.ordem);
      console.log(ordem)
    }
  }
  
  function search(obj, target){
    let response = null;
    
    Object.keys(obj).forEach(key => {
      if(key === target){
        response = obj[key];
      }
    });
    
    return response;
  }