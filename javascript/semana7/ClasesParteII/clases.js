class Persona{
    //atributos estaticos
    static contadorPersonas=0;//atributo de clase
    //atributo q se asocia con los objetos y no con la clase
    //email= 'valor default email';
    //metodo estatico solo nos permite leer el valor q va a rgresar este metodo,no permite modificarlo
    static get MAX_OBJ(){
        return 5;
    }
    //agregamos constructor,en los parentesis podemos pasar parametros
    constructor(nombre,apellido){
     this._nombre= nombre;
     this._apellido=apellido;
     if(Persona.contadorPersonas < Persona.MAX_OBJ){
        this.idPersona= ++Persona.contadorPersonas;
     }
      else{
        console.log('se han superado el maximo de objetos permitidos');
      }
    }
    //metodo get
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre=nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido=apellido
    }
    nombreCompleto(){
        return this.idPersona+" "+ this._nombre + " " + this._apellido;
    }
    toString(){
        //se aplica polimorfismo
        return this.nombreCompleto();
    }
    //metodo estatico
    static saludar(){
        console.log('saludos desde metodo static')
    }
    //metodo estatico le podemos pasar como argumento un objeto
    static saludar2(persona){
        console.log(persona.nombre);
    }
}
class Empleado extends Persona{
   constructor(nombre, apellido,departamento){
    super(nombre,apellido);
    this._departamento=departamento;
   } 
   get departamento(){
    return this._departamento;
   }
   set departamento(departamento){
    this._departamento= departamento;
   }
   //sobreescritura tiene q ser el mismo nombre q en la clase padre y parametrs tambien
   nombreCompleto(){
        return super.nombreCompleto()+','+this._departamento;
   }

}
//creamos objeto
let persona1= new Persona('Mica','Diaz');
console.log(persona1.toString());
let empleado1=new Empleado('Mica','Diaz','Programacion');
console.log(empleado1.toString());
//console.log(empleado1._nombre);
//let persona2= new Persona('carlos','lara');
//console.log(persona2);
//accedo a la propiedad nombre a traves de get
//console.log(persona1.nombre);
//metodo set para cambiar valor
//persona1.nombre='juan Carlos';

//metodos get y set
//el metodo get no se puede llamar igual que la propiedad
/*console.log(empleado1.nombreCompleto());
empleado2 = new Empleado('joa','quiroga','logistica');
console.log(empleado2);
console.log(empleado2.nombreCompleto())
console.log(empleado1.toString())
Persona.saludar();
Persona.saludar2(persona1);
Empleado.saludar();
Empleado.saludar2(empleado2);
//atributo estatico
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);
//acceder al atributo email
console.log(persona1.email);
console.log(empleado1.email);
*/
console.log(Persona.MAX_OBJ);
