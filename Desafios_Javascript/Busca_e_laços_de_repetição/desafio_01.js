/* Desafio 1 - O Escolhido */

let numStudent = parseInt(gets());
let student;
let note;
let maxNote = {
  student: 0,
  note: 0
}

for(let count = 0; count < numStudent; count++){
  [student, note] = gets().split(' ').map(element => parseInt(element));
  
  if(note >= 8){
    if(note > maxNote.note){
      maxNote = {
        student,
        note
      }
    }
  }
}

if(maxNote.note >= 8){
  console.log(maxNote.student);
}
else{
  console.log("Minimum note not reached");
}