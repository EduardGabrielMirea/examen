import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        List<String> coches = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        System.out.println("Introduce coches (Sales con enter): ");
        while (true){
            String coche = tc.nextLine();
            if (coche.isEmpty()){
                break;
            }
            coches.add(coche);
        }
        coches.stream().sorted().forEach(System.out::println);
    }
}