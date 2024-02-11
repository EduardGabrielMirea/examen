package comunidad;

import java.io.*;
import java.util.*;

public class Poblacion {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\eduar\\IdeaProjects\\examen\\src\\comunidad\\archivo"));
        ArrayList<ComunidadAutonoma> lista = new ArrayList<>();

        String linea;
        String[] tabla;

        linea = reader.readLine();
        while((linea = reader.readLine())!= null) {
            tabla = linea.split(",");

            String nombre = tabla[0];
            int poblacion = Integer.parseInt((tabla[1].replaceAll("\\D","")));

            ComunidadAutonoma comunidad = new ComunidadAutonoma(nombre,poblacion);
            lista.add(comunidad);
        }
        reader.close();
        lista.stream().sorted().forEach(System.out::println);
    }
}

