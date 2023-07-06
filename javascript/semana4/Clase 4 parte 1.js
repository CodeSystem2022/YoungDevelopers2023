// Variable normal
let x = 10;
console.log(x.length);
console.log('Tipos primitivos');

// Objecto
let persona = {
    nombre: 'Ana',
    apellido: 'Zambrana',
    email: 'anazambrana869@gmail.com',
    edad: 22,
    nombreCompleto: function(){
        return this.nombre + ' ' + this.apellido;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());