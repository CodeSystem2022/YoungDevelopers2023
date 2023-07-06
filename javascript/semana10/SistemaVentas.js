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
<<<<<<< HEAD
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
=======
        return this._idOrden; 
    }
    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto); // Tenemos 2 tipos de sintaxis:1
            //this._productos[this._contadorProductosAgregados++] = producto //Segunda sintaxis
        }
        else{
            console.log('Nose pueden agregar más productos')
        }
    }//Fin del método agregarProducto
    calcularTotal(){
        let totalVenta = 0; 
        for(let producto of this._productos){
            totalVenta += producto.precio; 
        } //Fin ciclo for 
        return totalVenta;
    } //Fin del método calcularTotal
    mostrarOrden (){
        let productoOrden =' '; 
        for(let producto of this._productos){
            productoOrden += '\n {'+producto.toString()+ '}'; 
        }//Fin del ciclo for 
        console.log (`Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productoOrden}`);
    }//Fin del metodo mostrarOrden
    } //Fin del ciclo Orden
   
let producto1 = new Producto('Pantalón', 200); 
let producto2 = new Producto('camisa',150);
let producto3 = new Producto ('Cinturon', 50);  
let orden1 = new Orden(); 
let orden2 = new Orden(); 
orden1.agregarProducto(producto1); 
orden1.agregarProducto(producto2); 
orden1.agregarProducto(producto3); 
orden2.agregarProducto(producto1); 
orden2.agregarProducto(producto2); 
orden2.agregarProducto(producto3); 
orden1.mostrarOrden(); 
orden2.mostrarOrden(); 
>>>>>>> 0955e0afba485d41f881d5ce08af69c78c61be37

let producto1 = new Producto("Pantalon", 200);
let producto2 = new Producto("Camisa", 150);
let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
mostrarOrden();