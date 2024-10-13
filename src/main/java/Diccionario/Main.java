package Diccionario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el cuento (termine con un punto al final):");
        String texto = scanner.nextLine();

        Procesadordetexto procesadorDeTexto = new Procesadordetexto();

        procesadorDeTexto.procesarTexto(texto);

        scanner.close();
    }
}
