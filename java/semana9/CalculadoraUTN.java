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
