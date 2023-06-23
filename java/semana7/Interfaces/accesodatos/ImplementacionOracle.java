
package accesodatos;


public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("insertar desde oracle");  
    }

    @Override
    public void listar() {
        System.out.println("Listar desde oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde oracle");
    }
    
}
