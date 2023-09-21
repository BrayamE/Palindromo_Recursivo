import java.util.Scanner;

public class PalindromoRecursivo {
    public static boolean esPalindromo(String cadena) {
        if (cadena.length() <= 1) {
            return true;
        } else {
            char primerCaracter = cadena.charAt(0);
            char ultimoCaracter = cadena.charAt(cadena.length() - 1);
            if (primerCaracter == ultimoCaracter) {
                String subcadena = cadena.substring(1, cadena.length() - 1);
                return esPalindromo(subcadena);
            } else {
                return false;

            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Hola, Brayam Edwin Quispe Apaza");
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine().toUpperCase();
        scanner.close();
        boolean esPalindromo = esPalindromo(cadena);
        System.out.println("La cadena es un palíndromo: " + esPalindromo);
    }
}
