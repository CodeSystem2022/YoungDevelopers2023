import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) { //Ciclo infinito
            System.out.println("*********Aplicación de Calculadora*************");
            MostrarMenu();

                try{
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    EjecutarOperacion(operacion, entrada);
                }
                else if (operacion == 5) {
                    System.out.println("Hasta pronto");
                    break;
                }
                else {
                    System.out.println("Opción erronea: "+operacion);
                }
                System.out.println("");
            } catch (Exception e) {
                System.out.println("Ocurrió un error"+e.getMessage());
                System.out.println("");
            }
        }
    }
    private static void MostrarMenu(){
        //Mostramos el menú
        System.out.println("""
                1.Suma 
                2.Resta
                3.Multiplicación
                4.Division 
                5.Salir
                """);
        System.out.println("¿Que operacion desea realizar?");
    }
    private static void EjecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Digite el valor para el operando1: ");
        var operando1 = Integer.parseDouble(entrada.nextLine());
        System.out.print("Digite el valor para el operando2: ");
        var operando2 = Integer.parseDouble(entrada.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> { // adición
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
                }
            case 2 -> { // sustracción
                resultado = operando1 + operando2;
                System.out.println("Resutado de la resta: "+ resultado);
            }
            case 3 -> { // multiplicación
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicación "+resultado);
            }
            case 4 -> { // división
                resultado = operando1 / operando2;
                System.out.println("Resultado de la división "+resultado);
            }
            default -> System.out.println("Opción erronea "+operacion);
        }
    }
}