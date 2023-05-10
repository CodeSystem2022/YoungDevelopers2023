package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); //Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton ("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //Creamos otros objetos de diferentes marcas
        //Computadora Gamer
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton ("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        //Computadora Sony
        Monitor monitorSony = new Monitor("Sony", 27);
        Teclado tecladoSony = new Teclado("Bluetooth", "Sony");
        Raton ratonSony = new Raton ("Bluetooth", "Sony");
        Computadora computadoraSony = new Computadora("Computadora Sony", monitorSony, tecladoSony, ratonSony);
        
        //Computadora LG
        Monitor monitorLG = new Monitor("LG",16 );
        Teclado tecladoLG = new Teclado("Bluetooth", "LG");
        Raton ratonLG = new Raton ("Bluetooth", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, tecladoLG, ratonLG);
        
        //Computadora Genius
        Monitor monitorGenius = new Monitor("Genius", 20);
        Teclado tecladoGenius = new Teclado("Bluetooth", "Genius");
        Raton ratonGenius = new Raton ("Bluetooth", "Genius");
        Computadora computadoraGenius = new Computadora("Computadora Genius", monitorGenius, tecladoGenius, ratonGenius);
        
        //Computadora Intel
        Monitor monitorIntel = new Monitor("Intel", 24);
        Teclado tecladoIntel = new Teclado("Bluetooth", "Intel");
        Raton ratonIntel = new Raton ("Bluetooth", "Intel");
        Computadora computadoraIntel = new Computadora("Computadora Intel", monitorIntel, tecladoIntel, ratonIntel);
        
        //Computadora Lenovo
        Monitor monitorLenovo = new Monitor("Lenovo", 32);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton ("Bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        //Computadora IBM
        Monitor monitorIBM = new Monitor("IBM", 17);
        Teclado tecladoIBM = new Teclado("Bluetooth", "IBM");
        Raton ratonIBM = new Raton ("Bluetooth", "IBM");
        Computadora computadoraIBM = new Computadora("Computadora IBM", monitorIBM, tecladoIBM, ratonIBM);
        
        //Computadora acer
        Monitor monitoracer = new Monitor("acer", 32);
        Teclado tecladoacer = new Teclado("Bluetooth", "acer");
        Raton ratonacer = new Raton ("Bluetooth", "acer");
        Computadora computadoraacer = new Computadora("Computadora acer", monitoracer, tecladoacer, ratonacer);
        
        //Computadora Philips
        Monitor monitorPhilips = new Monitor("Philips", 22);
        Teclado tecladoPhilips = new Teclado("Bluetooth", "Philips");
        Raton ratonPhilips = new Raton ("Bluetooth", "Philips");
        Computadora computadoraPhilips = new Computadora("Computadora Philips", monitorPhilips, tecladoPhilips, ratonPhilips);
        
   
        Orden orden1 = new Orden(); //Inicializamos el arreglo vacio
        Orden orden2 = new Orden(); //Tenemos una nueva lista para el objeto orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraSony);
        orden1.agregarComputadora(computadoraLG);
        orden1.agregarComputadora(computadoraGenius);
        orden1.agregarComputadora(computadoraIntel);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraIBM);
        orden1.agregarComputadora(computadoraacer);
        orden1.agregarComputadora(computadoraPhilips);
        
        
        orden1.mostrarOrden();
        
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
        //Crear mas objetos de tipo computadora con todos sus elementos
        //completar una lista en el objeto orden1 que llegue a los 10 elementos
        //probar de esta manera los metodos al maximo rendimiento
    }
    
}
