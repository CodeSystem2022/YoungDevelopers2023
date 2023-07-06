package UTN.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getCONNECTION(){
        Connection conexion = null;
        //variable para conectarnos a la bd
        var baseDatos = "estudiantes2022";
        var url = "jdbc:mysql://localhost:3306/"+baseDatos;
        var usuario= "root";
        var password="Mica0304";

        //cargamos la clase del driver de mysql en memoria
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url,usuario,password);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("ocurrio un error en la conexion:"+e.getMessage());
        }//fin catch
        return conexion;
    }//fin metodo connection
}
