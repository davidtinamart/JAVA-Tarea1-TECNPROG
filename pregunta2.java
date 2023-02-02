//¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?

import java.util.Scanner;

public class pregunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué algoritmos usas en tu vida cotidiana? ¿Piensas que podrías escribir un programa para hacerlos más eficientes?");
        String respuesta = sc.nextLine();
        System.out.println("¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?");
        String respuesta2 = sc.nextLine();
        sc.close();
    }
}