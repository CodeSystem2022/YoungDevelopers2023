package UTN.datos;

import UTN.dominio.Estudiante;
import static UTN.conexion.Conexion.getCONNECTION;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //método listar
    public List<Estudiante>listarEstudiantes(){
        List<Estudiante>estudiantes = new ArrayList<>();
        //creamos algunos objetos que son necesarios para comunicarnos con la bd
        PreparedStatement ps;//nos ayuda a preparar(introduce) la sentencia sql
        ResultSet rs;//nos permite almacenar (obtener) el resultado obtenido desde la bd
        //creamos un objeto de tipo conexion
        Connection con = getCONNECTION();
        String sql = "SELECT * FROM estudiantes ORDER BY idestudiante";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //falta agregarlo a la lista
                estudiantes.add(estudiante);

            }
        }catch(Exception e){
            System.out.println("ocurrio un error al seleccionar  datos:"+e.getMessage());
        }
        finally {
           try{
               con.close();
           }catch(Exception e){
               System.out.println("ocurrio un error al cerrar la conexion:"+e.getMessage());
           }
        }//fin finally
        return estudiantes;
    }//fin metodo listar
