package UTN.dominio;

public class Estudiante {
    private int idEstudiante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Estudiante(){}
    public Estudiante(int idEstudiante){
        this.idEstudiante=idEstudiante;
    }
    //constructor para insertar un nuevo estudiante
    public Estudiante(String nombre,String apellido,String telefono,String email){
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
    }
    //constructor para modificar
    public Estudiante(int idEstudiante,String nombre,String apellido,String telefono,String email){
        this.idEstudiante=idEstudiante;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
    }
