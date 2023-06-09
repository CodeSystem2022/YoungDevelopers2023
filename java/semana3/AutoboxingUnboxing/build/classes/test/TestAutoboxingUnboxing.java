
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o wrapper
        /*
            Clases envolventes de tipos primitivos
            int= la clase envolvente es Integer
            long= la clase envolvente es long
            float= la clase envolvente es float
            double= la clase envolvente es double
            boolean= la clase envolvente es boolean
            byte= la clase envolvente es byte
            char= la clase envolvente es char
            short= la clase envolvente es short
        */
        int enteroPrim = 10; //tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; //tipo object con la clase integer
        System.out.println("entero = " + entero.doubleValue()); //autoboxing
        
        int entero2 = entero; //unboxing
        System.out.println("entero2 = " + entero2);
        
    }
    
}
