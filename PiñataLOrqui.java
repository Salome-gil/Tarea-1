import java.util.Scanner;

public class PiñataLOrqui {
    public static void main(String[] args) {
        double PrecioProducto2 = 5.000;
        double PrecioProducto5 = 3.000;
        double descauentoPro2 = 0.0;
        double descuentoPro5 = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresela cantidad del producto 2: ");
        double CantiP2 = sc.nextInt();
        System.out.print("Ingrese la cantidad del producto 5: ");
        double CantiP5 = sc.nextInt();

        if (CantiP2 == 1)
            descauentoPro2 = 10;
        else if (CantiP2 == 2)
            descauentoPro2 = 15;
        else if (CantiP2 == 3)
            descauentoPro2 = 20;
        else if (CantiP2 > 3)
            descauentoPro2 = 20;

        if (CantiP5 <= 16)
            descuentoPro5 = 0;
        else if (CantiP5 <= 32)
            descuentoPro5 = 6.25;
        else
            CantiP5 = 12.5;

        double totalP2 = CantiP2 * PrecioProducto2;
        double totalP5 = CantiP5 * PrecioProducto5;
        double totalConDescP2 = totalP2 - (totalP2 * descauentoPro2 / 100);
        double totalConDescP5 = totalP5 - (totalP5 * descuentoPro5 / 100);
        double totalFinal = totalConDescP2 + totalConDescP5;

        System.out.println("\nResumen de compra:");
        System.out.println("Producto 2 - Total sin descuento: $" + totalP2 + " | Descuento: " + descauentoPro2
                + "% | Total con descuento: $" + totalConDescP2);
        System.out.println("Producto 5 - Total sin descuento: $" + totalP5 + " | Descuento: " + descuentoPro5
                + "% | Total con descuento: $" + totalConDescP5);
        System.out.println("Total a pagar: $" + totalFinal);

    }
}