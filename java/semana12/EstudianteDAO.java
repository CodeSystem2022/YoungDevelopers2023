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

    
    //método por id-> fin by id
    public boolean buscarEstudianteporId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getCONNECTION();
        String sql = "SELECT * FROM estudiantes WWHERE idestudiantes=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true;//se encontro un registro
            }//fin if
        }catch(Exception e){
            System.out.println("Ocurrio un error al buscar estudiante:"+e.getMessage());
        }//fin catch
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("ocurrio un error al cerrar conexion:"+e.getMessage());
            }//fin catch
        }//fin finally
        return false;
    }
    //Metodo agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getCONNECTION();
        String sql = "INSERT INTO estudiantes(nombre,apellido,telefono,email)VALUES (?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return  true;

        }catch(Exception e){
            System.out.println("ocurrio un error ");
        }//fin catch
        finally{
          try{
              con.close();
          }catch(Exception e){
              System.out.println("error al cerrar la conexion:"+e.getMessage());
          }//fin catch
        }//fin finally
        return false;
    }//fin metodo agregar estudiante
