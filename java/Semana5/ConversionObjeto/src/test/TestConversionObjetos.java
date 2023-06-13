
package test;

import domain.*;


public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("juan",5000,TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado.toString());
        System.out.println(empleado.obtenerDetalles());
        
        //hacemos una conversion Downcasting
        ((Escritor)empleado).getTipoEscritura();
        
        //conversion Upcasting
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //Asignar una variable de tipo hija a una variable de tipo padre
        //no es necesario hacer una conversion explicita
        Empleado empleado2 = escritor;
        empleado2.obtenerDetalles();
    }
}
