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

//Distinta formas de imprimir un objeto
//Número 1: La más sencilla: concatenar cada valor de cada propiedad
console.log('Distinta formas de imprimir un objecto: forma 1');
console.log(persona.nombre+', '+persona.apellido);

//Número 2: A través del ciclo for in
for(nombrePropiedad in persona){
    console.log(propiedad[nombrePropiedad]);
}

//Número 3: La función Object.values()
let personaArray = Object.values(persona);
console.log(personaArray);

//Número 4: Utilizaremos el método JSON.stringify
console.log('Distinta formas de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);