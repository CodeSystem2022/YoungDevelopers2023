//let persona3 = new Persona('carla','Ponce');
class Persona{ //Clase Padre
    constructor(nombre, apellido){
        this._nombre = nombre; 
        this._apellido = apellido; 
    }
    get nombre(){
        return this._nombre; 
    }

    set nombre(nombre){
        this._nombre = nombre; 
    }
    get apellido (){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this._nombre+' '+this._apellido; 
    }
    toString(){//Regrea un String
        return this.nombreCompleto(); 
    }

    //Sobreescribiendo el metodo de la clase padre (Object)
    toString(){
        //Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion 
        //El método que se ejecuta depende si es una referencia de tipo padre o hija 

        return this.nombreCompleto(); 
    }

    
}
class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido); 
        this._departamento= departamento; 

    }
    get (departamento){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento; 
    }

    //Sobreescritura 
    nombreCompleto(){
        return super.nombreCompleto()+', ' +this._departamento;
    }

}
let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre="Juan Carlos"
console.log(persona1.nombre);
//console.log(persona1)
let persona2 = new Persona('Carlos', 'Lara'); 
console.log(persona2.nombre);
persona2.nombre="Maria Laura";
console.log(persona2.nombre); 
//console.log(persona2); 

let Empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(Empleado1); 
console.log(Empleado1.nombreCompleto());  

//object.prototype.toString Esta es la manerda de acceder a los atributos y metodos de manera dinamica
console.log(Empleado1.toString()); 
console.log(persona1.toString()); 
console.log(persona2.toString()); 