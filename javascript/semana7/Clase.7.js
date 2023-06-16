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

