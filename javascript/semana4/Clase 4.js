//var
let x = 10;
console.log(x.length);
console.log('Tipos primitivos');

//object
let persona = {
    nombre: 'Agustín',
    apellido: 'Ceschin',
    email: 'agusces0@gmail.com',
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
console.log('Creamos un nuevo objeto');
console.log(persona.nombreCompleto());
console.log('Usamos el ciclo fin');

let persona2 = new Object();
persona2.nombre = 'Ana';
persona2.apellido = 'Zambrana';
persona2.email = 'anazambrana869@gmail.com';
console.log(persona2);

console.log(persona['apellido']);

for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('Cambiamos y eliminamos un error');
persona.apellido2 = 'Ceschin';
delete persona.apellido2;
console.log(persona);