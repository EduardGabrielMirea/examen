import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagramas2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\eduar\\IdeaProjects\\examen\\src\\anagrama"));
        Map<String, ArrayList<String>> anagramas = new HashMap<>();

        String linea;

        while ((linea = reader.readLine()) != null) {
            String alfabetica = alfabetizar(linea);
            anagramas.computeIfAbsent(alfabetica, k -> new ArrayList<>()).add(linea);
        }
        reader.close();

        //Minimo 2 valores.
        int minGroupSize = 2;
        anagramas.forEach((alfabetica, lista) -> {if (lista.size() >= minGroupSize) {System.out.println(alfabetica + "-->" + lista);}});
    }

    public static String alfabetizar(String linea) {
        //Divido en letras la linea
        char[] letra = linea.toCharArray();
        //Ordeno las letras para alfabetizar
        Arrays.sort(letra);
        //return
        return new String(letra);
    }
}
