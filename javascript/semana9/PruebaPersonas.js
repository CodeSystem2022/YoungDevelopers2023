class Persona{
    static contadorPersonas = 0;
    

    constructor(nombre, apellido, edad){
        this._idPersona = ++Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    get idPersona(){
        return this._idPersona;
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
    set apellido(apellido) {
        this._apellido = apellido;
    }
    get edad(){
        return this._edad;
    }
    set edad(edad) {
        this._edad = edad;
    }

    toString() {
        return `${this._idPersona} ${this._nombre} ${this._apellido} ${this._edad}`;
      }
      
}


class Empleado extends Persona{
    static contadorEmpleados = 0;

    constructor(nombre, apellido, edad, sueldo){
        super(nombre, apellido, edad); 
        this.idEmpleado = ++Empleado.contadorEmpleados;
        this._sueldo = sueldo;
    }

    get idEmpleado(){
        return this._idEmpleado;
    }
    set idEmpleado(idEmpleado){
        this._idEmpleado = idEmpleado;
    }

    get sueldo(){
        this._sueldo;
    }
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }

    toString(){
        return `${super.toString()} ${this.idEmpleado} ${this._sueldo}`; 
    }
}


class Cliente extends Persona{
    static contadorClientes = 0;

    constructor(nombre, apellido, edad, fecharegistro){
        super(nombre, apellido, edad); 
        this.idCliente = ++Cliente.contadorClientes;
        this.fecharegistro = fecharegistro;
    }

    get idCliente(){
        return this._idCliente;
    }
    set idCliente(idClient){
        this._idCliente = idClient;
    }

    get fecharegistro(){
        return this._fecharegistro;
    }

    set fecharegistro(fecharegistro){
        this._fecharegistro = fecharegistro;
    }

    toString(){
        return `${super.toString()} ${this._idCliente} ${this._fecharegistro}`;
    }
}

//Prueba Clase PErosnas
let persona1 = new Persona('Marcos','Messi',22);
console.log(persona1.toString());

let persona2 = new Persona('Pep','Guardiola',66)
console.log(persona2.toString());

//Prueba Clase Empleados
let empleado1 = new Empleado('Cristiano','Ronaldeski', 55, 1000);
console.log(empleado1.toString());

let empleado2 = new Empleado('karim','Vencido ',56, 2000);
console.log(empleado2.toString());

//Prueba Clase Cliente
let cliente1 = new Cliente('Walter','White', 29, new Date());
console.log(cliente1.toString());

let cliente2 = new Cliente('Frank','Sinatra',22, new Date());
console.log(cliente2.toString())
