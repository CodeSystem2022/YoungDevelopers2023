console.log(typeof miFuncion);
function miFuncionDos(a, b){
    console.log(arguments.length);
}

miFuncionDos(5, 7);

//toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);
