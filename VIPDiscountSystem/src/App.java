import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("*** Sistema de Descuentos VIP ***");
       final var NO_PRODUCT_DISCOUNT = 10;
       var consola = new Scanner(System.in);  // Corrección aquí
       System.out.print("¿Cuántos productos compraste hoy?");
       var cantidadProductos = Integer.parseInt(consola.nextLine());

       System.out.println("¿Tienes la membresía de la tienda (true/false)?");
       boolean tienesMembrecia = Boolean.parseBoolean(consola.nextLine());

       var esElegibleParaDescuentoVIP = cantidadProductos >= NO_PRODUCT_DISCOUNT && tienesMembrecia;    
       System.out.println("¿Tienes acceso al descuento VIP? " + esElegibleParaDescuentoVIP);

       consola.close(); // Importante cerrar el Scanner para evitar fugas de recursos
    }
}
