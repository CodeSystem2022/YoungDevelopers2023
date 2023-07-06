package domain;
    
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{ //Bloque de inicialización estático
        System.out.println("Ejecución del bloque estático");
        ++Persona.contadorPersonas;
        //idPersona = 10; No es estático por eso tenemos un error
    }
    
    { //Bloque de inicialización NO estático (contexto dinámico)
        System.out.println("Ejecución de bloque NO estático");
        this.idPersona = Persona.contadorPersonas++;//Incrementamos el atributo
        
    }
    //Los bloques de inicializacíon se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Ejecucuion del constructor");
    }
    
    public int getidPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
