package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
      public static void main(String[] args) {
          //System.out.println("Dia 1: "+Dias.LUNES);
          //indicarDiaSemana(Dias.LUNES); //Las enumeraciones se tratan como cadenas
          //No se deben utilizar comillas, se accede a traves de el operador de punto
          
          //Agregamos los demas continentes
          
          System.out.println("Continente no. 1: "+Continentes.AFRICA);
          System.out.println("No. de paises en el 1er. Continente: "+Continentes.AFRICA.getPaises());
          System.out.println("No. de habitantes en el 1er. Continente: "+Continentes.AFRICA.getHabitantes());
          
          System.out.println("Continente no. 2: "+Continentes.EUROPA);
          System.out.println("No. de paises en el 2do. Continente: "+Continentes.EUROPA.getPaises());
          System.out.println("No. de habitantes en el 2do. Continente: "+Continentes.EUROPA.getHabitantes());
          
          System.out.println("Continente no. 3: "+Continentes.ASIA);
          System.out.println("No. de paises en el 3er. Continente: "+Continentes.ASIA.getPaises());
          System.out.println("No. de habitantes en el 3er. Continente: "+Continentes.ASIA.getHabitantes());
          
          System.out.println("Continente no. 4: "+Continentes.AMERICA);
          System.out.println("No. de paises en el 4to. Continente: "+Continentes.AMERICA.getPaises());
          System.out.println("No. de habitantes en el 4to. Continente: "+Continentes.AMERICA.getHabitantes());
          
          System.out.println("Continente no. 5: "+Continentes.OCEANIA);
          System.out.println("No. de paises en el 5to. Continente: "+Continentes.OCEANIA.getPaises());
          System.out.println("No. de habitantes en el 5to. Continente: "+Continentes.OCEANIA.getHabitantes());
    
      }
   
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            //agregar todos los dias de la semana
            //agregar default - otro dato que no corresponde
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("Dia no encontrado");
        }
    }
      
}
