import comunidad.ComunidadAutonoma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Anagramas {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\eduar\\IdeaProjects\\examen\\src\\anagrama"));
        Map<String, ArrayList<String>> anagrama = new HashMap<>();

        String linea;

        linea = reader.readLine();
        while ((linea = reader.readLine())!=null) {
            String alfabetica =  alfabetizar(linea);
            anagrama.computeIfAbsent(alfabetica, k -> new ArrayList<>()).add(linea);
        }
        reader.close();

        int minGroupSize= 2;
        anagrama.forEach((alfabetica,lista) -> {
            if (lista.size() >= minGroupSize) {
                System.out.println(alfabetica+ " --> " +lista);
            }
        });
    }
    public static String alfabetizar(String linea){
        char[] letras = linea.toCharArray();
        Arrays.sort(letras);
        return new String(letras);
    }
}
