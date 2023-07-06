class Producto{

    static contadorProductos = 0; 

    constructor(nombre,precio){
        this._idProducto = ++Producto.contadorProductos; 
        this._nombre = nombre; 
        this._precio = precio; 
    }
    
    get idProducto(){
        return this._idProducto
    }
    get nombre(){
        return this._nombre
    }
    set nombre(nombre){
        this._nombre = nombre; 
    }
    get precio(){
      return this._precio;   
    }
    set precio(precio){
        this.precio = precio; 
    }
    toString(){ //Template Literals: Nos permite insertar codigo dinamicamente
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    } 
    
}//Fin de la clase producto

class Orden{
    static contadorOrdenes = 0; 
    static getMAX_PRODUCTOS(){ //Simula una constante
        return 5; 
    }
    constructor(){
        this._idOrden = ++Orden.contadorOrdenes; 
        this._productos = []; 
        this._contadorProductosAgregados = 0; 
    }
    get idOrden(){
        return this._idOrden;
    }
    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto);
            //this._productos[this._contadorProductosAgregados++] = producto;
        }
        else {
            console.log("No se pueden agregar más productos");
        }
    }
    calcularTotal(){
        let totalVenta = 0;
        for(let producto of this._productos){
            totalVenta += producto.precio;
        }
        return totalVenta;
    }
    mostrarOrden(){
        let productoOrden = ' ';
        for(let producto of this._productos){
            productoOrden += producto.toString()+' ';
        }
        console.log(`Orden: ${this.idOrden}, Total: $${this.calcularTotal()}, Productos: ${productoOrden}`);
    }
}

let producto1 = new Producto("Pantalon", 200);
let producto2 = new Producto("Camisa", 150);
let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
mostrarOrden();