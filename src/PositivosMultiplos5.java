import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PositivosMultiplos5 {
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<>(Arrays.asList("10","20","7"));

        long cuantos;
        double media;

        media = numeros.stream().mapToInt(Integer::parseInt).average().orElse(0);
        cuantos = numeros.stream().mapToInt(Integer::parseInt).filter(n -> n % 5 == 0).count();

        System.out.println("Divisibles: " +cuantos+ " Media: "+media);
    }

}
