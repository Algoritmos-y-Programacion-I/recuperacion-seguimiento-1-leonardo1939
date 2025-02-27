

import java.util.Scanner;

public class Recuperatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ejercicio 1
        System.out.println("Cantidad de números iguales");
        System.out.print("Ingrese tres números enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Cantidad de números iguales: " + Contariguales(num1, num2, num3));
        
        // Ejercicio 2
        System.out.println("Saludo o despedida");
        System.out.println("Ingrese un nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingrese 1 para saludo o 0 para despedida: ");
        int opcion = scanner.nextInt();
        System.out.println(Generarmensaje(nombre, opcion));
        
        // Ejercicio 3
        System.out.println("Contar cadenas con 4 o más caracteres");
        System.out.print("Ingrese tres palabras: ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        System.out.println("Cantidad de palabras con 4 o más caracteres: " + Cadenalarga(str1, str2, str3));
        
        // Ejercicio 4
        System.out.println("\nEjercicio 4: Comparar tercera posición de cadenas");
        System.out.print("Ingrese dos palabras: ");
        String palabra1 = scanner.next();
        String palabra2 = scanner.next();
        System.out.println(CompararPosicion(palabra1, palabra2));
        
        
        scanner.close();
    }

    public static int Contariguales(int X, int Y, int Z) {
        if (X == Y && Y == Z) return 3;
        if (X == Y || Y == Z || Y == Z) return 2;
        return 0;
    }

    public static String Generarmensaje(String nombre, int opcion) {

        if (opcion == 1) return "Hola " + nombre;
        if (opcion == 0) return "Chao " + nombre;
        return "entradas inválidas";
    }

    public static int Cadenalarga(String str1, String str2, String str3) {
        int count = 0;
        if (str1.length() >= 4) count++;
        if (str2.length() >= 4) count++;
        if (str3.length() >= 4) count++;
        return count;
    }

    public static String CompararPosicion(String str1, String str2) {
        if (str1.length() < 3 || str2.length() < 3) return "Uno de los mensajes es demaciado largo";
        return str1.charAt(2) == str2.charAt(2) ? "Verdadero" : "Falso";
    }

}