//declarar un areglo
//let autos = new Array('BMW','Mercedes Benz','Volvo');
//forma recomendada, cosnt xq la referencia en memoria no se modifica
const autos = ['BMW','Mercedes Benz','Volvo'];
console.log(autos);

//para acceder a los elementos de un arreglo
console.log(autos[2]);
console.log(autos[1]);
//recorrer todos los elementos de una sola vez
for (let i =0;i < autos.length;i++){
    console.log(i + ' : ' + autos[i]);
}
//for each
autos.forEach(a => console.log(a));
