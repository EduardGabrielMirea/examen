import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String scanner;

        while (true){
            System.out.println("Introduce palabras: ");
            scanner = tc.nextLine();

            if (scanner.isEmpty()){
                break;
            }

            Map<String,Integer> imprimir = new HashMap<>();
            String[] palabras = scanner.split(" ");
            for (int i = 0; i < palabras.length; i++) {
                Integer repite = imprimir.get(palabras[i]);
                if (repite == null){
                    imprimir.put(palabras[i],1 );
                }else {
                    imprimir.put(palabras[i], repite +1 );
                }
            }
            System.out.println(imprimir);
        }

    }
}
