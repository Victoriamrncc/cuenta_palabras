package Diccionario;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Procesadordetexto {

    public void procesarTexto(String texto) {
        String[] frases = texto.split("\\.\\s*");
        int totalLetras = 0;

        for (int i = 0; i < frases.length; i++) {
            String frase = frases[i].trim();

            Map<Integer, Long> palabrasPorLongitud = Arrays.stream(frase.toLowerCase().split("[^a-záéíóúüñ]+"))
                    .filter(palabra -> !palabra.isEmpty())
                    .collect(Collectors.groupingBy(String::length, Collectors.counting()));

            totalLetras += Arrays.stream(frase.toLowerCase().split("[^a-záéíóúüñ]+"))
                    .mapToInt(String::length)
                    .sum();

            System.out.println("Frase " + (i + 1) + ": \"" + frase + "\"");
            System.out.println("En la frase hay:");

            palabrasPorLongitud.forEach((longitud, cantidad) ->
                    System.out.println(cantidad + " palabras de " + longitud + " letras.")
            );

            System.out.println();
        }
        System.out.println("Total de letras en todo el cuento: " + totalLetras);
    }
}
