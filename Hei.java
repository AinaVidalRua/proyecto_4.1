package world;
import java.util.Scanner;

public class Hei {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String nombre = scanner.nextLine();

        saludar(nombre);
    }

    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre + "! Bienvenido al mundo.");
    }
}
