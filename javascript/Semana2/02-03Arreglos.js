//let autos = new Array('Ferrari', 'Renault', 'BMW'), SINTAXIS VIEJA
const autos= ['Ferrari', 'Renault', 'BMW'];
console.log(autos);
//Recorremos los elementos
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
    console.log(i+' : '+autos[i]);
}

//Modificamos los elementos
autos[1]= 'Volvo';
console.log(autos[1]);

//Agregamos nuevos valores al arreglo
autos.push('Audi'); //agregamos el elemento al final
console.log(autos);

// Otras formas de agregar elementos al arreglo
autos[autos.length]= 'Porche';
console.log(autos);

// Tercera forma de agregar elementos teniendo cuidado
autos[6]= 'Renault';
console.log(autos);

// Como preguntar si es un arreglo o array
console.log(Array.isArray(autos)); // Devuelve un booleano

console.log(autos instanceof Array); // Preguntamos si la variable es una instancia de la clase ARRAY