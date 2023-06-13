
package domain;


public class Empleado {

    /**
     cuando trabajamos con sobreescritura hay que aplicar herencia
     * ya q la sobreescritura significa q un metodo en la clase hija
     * modifica el comportamiento en la clase padre
     */
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre,double sueldo){
        this.nombre= nombre;
        this.sueldo=sueldo;
    }
        //metodo
    public String obtenerDetalles(){
        return "Nombre:"+this.nombre + ",sueldo:"+this.sueldo;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
        
    }
    

