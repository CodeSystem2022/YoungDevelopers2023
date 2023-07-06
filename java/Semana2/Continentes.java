package enumeraciones;

public enum Continentes {
    AFRICA(54, "1.4 billones"),
    EUROPA(46, "751 millones"),
    ASIA(51, "4.7 billones"),
    AMERICA(35, "1 billones"),
    OCEANIA(14, "41 millones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    //Metodo Get
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
