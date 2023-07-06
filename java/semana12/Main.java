package UTN;


import UTN.conexion.Conexion;

public class Main {
    public static void main(String[] args) {
       var conexion = Conexion.getCONNECTION();
       if(conexion != null)
           System.out.println("Conexion exitosa:"+conexion);
       else
           System.out.println("ocurrio un error al conectrase");
    }//fin main
}//fin clase
