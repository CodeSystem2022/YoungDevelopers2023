//Paso por referencia video 9.1
const persona = {
    nombre: "Juan",
    apellido: "Lepez"
}
console.log(persona);
function cambiarValorObjeto(p1){
    p1.nombre = "Ignacio";
    p1.apellido = "Perez";
}

cambiarValorObjeto(persona);
console.log(persona);
