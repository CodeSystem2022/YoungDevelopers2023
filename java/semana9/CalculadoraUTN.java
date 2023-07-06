import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) { //Ciclo infinito

            System.out.println("*********Aplicación de Calculadora*************");
            //Mostramos el menú
            System.out.println("""
                    1.Suma 
                    2.Resta
                    3.Multiplicación
                    4.Division 
                    5.Salir
                    """);
            System.out.println("¿Que operacion desea realizar?");
            try{
                var operacion = Integer.parseInt(entrada.nextLine());

                if (operacion >= 1 && operacion <= 4) {
                    System.out.print("Digite el valor para el operando1: ");
                    var operando1 = Integer.parseInt(entrada.nextLine());
                    System.out.print("Digite el valor para el operando2: ");
                    var operando2 = Integer.parseInt(entrada.nextLine());

                    int resultado;
                    switch (operacion) {
                        case 1 -> { //Suma
                            resultado = operando1 + operando2;
                            System.out.println("Resultado de la suma: " + resultado);
                        }
                        case 2 -> { //Resta
                            resultado = operando1 - operando2;
                            System.out.println("Resultado de la resta: " + resultado);
                        }
                        case 3 -> { //Multiplicacion
                            resultado = operando1 * operando2;
                            System.out.println("Resultado de la multiplicacion: " + resultado);
                        }
                        case 4 -> { //Division
                            resultado = operando1 / operando2;
                            System.out.println("Resultado de la division: " + resultado);
                        }
                        default -> System.out.println("Opcion erronea: " + operacion);
                    } //Fin switch

                } //Fin del if
                else if (operacion >= 5) {
                    System.out.println("Hasta pronto...");
                    break; //Rompe el ciclo y sale
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                //Imprimimos un salto de linea antes de repetir el menú
                System.out.println();
            } catch(Exception e ){ //Fin del try comienzo del catch
                System.out.println("Ocurrio un error: "+e.getMessage());
                System.out.println();
            }//Fin catch
    }//Fin while
    }//Fin main
}//Fin clase



                            

