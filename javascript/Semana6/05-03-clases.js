//let persona3 = new Persona('Carla', 'Ponce'); esto no se debe hacer: persona is not defined

class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    
    get nombre(){
        return this._nombre;
    }
    get apellido(){
        return this._apellido;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
}
    
    let persona1 = new Persona('Martin', 'Perez');
    console.log(persona1.nombre);
    persona1.nombre = 'Juan Carlos';
    console.log(persona1.nombre);
    persona1.apellido = 'Rojas';
    console.log(persona1.apellido)
    persona1.apellido = 'Rosas';
    console.log(persona1.apellido)
    //console.log(persona1);
    let persona2 = new Persona('Carlos', 'Lara');
    console.log(persona2.nombre);
    persona2.nombre = 'Maria Laura';
    console.log(persona2.nombre);
    //console.log(persona2);





  
