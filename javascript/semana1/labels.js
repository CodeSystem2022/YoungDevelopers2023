inicio:
for(let cont; cont <= 10; cont++){
    if(cont % 2 !== 0){
        continue inicio;
        //breack inciio;
    } else {
        break inicio;
    }
    console.log(cont)
}
console.log("Termina el bucle for");