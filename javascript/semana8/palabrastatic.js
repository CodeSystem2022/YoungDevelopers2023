class Persona{
    //atributo estatico
    //atributo de clase
    static contadorPersonas = 0;
    //atributo de nuestros objetos 
    //email = 'valor default email';
    //creacion metodo estatico no se puede modificar el valor
    static get MAX_OBJ (){
        return 5;
    }
    //nombre y apellido atributo no estatico
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if (Persona.contadorPersonas < Persona.MAX_OBJ){
            this._idPersona = ++Persona.contadorPersonas;
        }
        else{
            console.log('se han superado el maximo de objetos permitidos');
        }
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    get id(){
        return this._id;
    }
    //agregamos valor del id
    nombreCompleto(){
        return this._idPersona +' '+this._nombre + ' ' + this._apellido;
    }
    toString(){
        return this.nombreCompleto();
    }
    static saludar(){
        console.log('saludos desde el metodo estatico');
    }
    //el metodo estatico puede pasar como argumento un objeto
    static saludar2(persona){
        console.log(persona.nombre + ' '+ persona.apellido);
    }
}
class Empleado extends Persona{
    constructor(nombre,apellido,departamento){
        super(nombre,apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
    //sobrescritura
    nombreCompleto(){
        return super.nombreCompleto() + ',' + this._departamento;
    }
}


let persona1 = new Persona ('juan','perez');
console.log( persona1.toString() );
let empleado1 = new Empleado ('Maria','Jimenez','Sistemas');
console.log(empleado1.toString());

console.log(Persona.contadorPersonas);

let persona2 = new Persona('carla','Ramirez');
console.log(persona2.toString());
console.log(Persona.contadorPersonas);
let persona3 = new Persona('Mariano','nuñez');
console.log(persona3.toString());
console.log(Persona.contadorPersonas());

//mando a llamar metodo statico que se comporta como una constante
console.log(Persona.MAX_OBJ);
//no se puede modificar porque es una constante 
Persona.MAX_OBJ = 10;
console.log(Persona.MAX_OBJ);

let persona4 = new Persona('Armando','Toledo');
console.log(persona4.toString());
console.log(Persona.contadorPersonas());
let persona5 = new Persona('Diego','Ramoz');
console.log(persona5.toString());
console.log(Persona.contadorPersonas());

//el metodo saludar como esta asociado a la clase solo ella lo puede mandar a llamar
//los objetos no pueden usar el metodo estatico
Persona.saludar();
//metodo estatico con argumento de un objeto
Persona.saludar2(persona1);
//podemos ejecutar el metodo estatico en nuestras clases hijas
Empleado.saludar();
Empleado.saludar2(empleado1);
//usar la variable a traves del objeto,nos da undefined
//usar primero la referncia d un objeto y despues el nombre de una variable
//si esta variable no se encuentra en el objeto nos da undefined
//ya que esta variable esta asociada a la clase no al objeto

//console.log(persona1.contadorPersonas);
//por lo tanto  a la variable debemos accederla x medio de la clase
//console.log(Persona.contadorObjetosPersonas);
//accedemos a la variable desde la clase hija,se accede sin ningun problema
//console.log(Empleado.contadorObjetosPersonas);

//acceder a un atributo de objetos
//console.log(persona1.email);
//console.log(empleado1.email);
//console.log(Persona.email);
//console.log(Empleado.email);









