

    //metodo para modificar
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getCONNECTION();
        String sql = "UPDATE estudiante SET nombre =?,apellido=?,telefono=?,email=? WHERE idestudiantes=?";
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2,estudiante.getApellido());
            ps.setString(3,estudiante.getTelefono());
            ps.setString(4,estudiante.getEmail());
            ps.setInt(5,estudiante.getIdEstudiante());
            ps.execute();
            return  true;
        }catch(Exception e){
            System.out.println("error al modificarse estudiante:"+e.getMessage());
        }//fin catch
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("error al cerrar conexion:"+e.getMessage());
            }//fin catch
        }//fin finally
        return false;
    }//fin metodo modificar estudiante


    public static void main(String[] args) {
        var estudianteDao =  new EstudianteDAO();

        //modificar estudiante
        var estuduanteModificado = new Estudiante(1,"juan","perez","456123","jperez@email.com");
        var modificado = estudianteDao.modificarEstudiante(estuduanteModificado);
        if(modificado)
            System.out.println("estudiante modificado:"+estuduanteModificado);
        else
            System.out.println("no se modifico el estudiante: "+estuduanteModificado);

        //agregar estudiante
       // var nuevoEstudiante = new Estudiante("Carlos","Lara","5465544223","clara@gmail.com");
        //var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
        //if(agregado)
          //  System.out.println("estudiante agregado:"+nuevoEstudiante);
        //else
        //    System.out.println("no se ha agregado estudiante:"+ nuevoEstudiante);

        // listar los estudiantes
        System.out.println("listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);//FUNCION LAMBDA para imprimir

        //buscar por id
        //var estudiante1 = new Estudiante(1);
        //System.out.println("Estudiantes antes de la busqueda :"+estudiante1);
        //var encontrado = estudianteDao.buscarEstudianteporId(estudiante1);
        //if(encontrado)
        //    System.out.println("estudiante encontrado:"+estudiante1);
        //else
        //    System.out.println("no se encontro el estudiante: "+estudiante1.getIdEstudiante());


    }
}
