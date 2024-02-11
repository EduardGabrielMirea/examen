package felipe;

import java.util.ArrayList;

public class MainFelipe {
    public static void main(String[] args) {
        ArrayList<Tareas> lista = new ArrayList<>();
        lista.add(new Tareas(1,4));
        lista.add(new Tareas(1,2));
        lista.add(new Tareas(4,5));

        lista.stream().sorted().forEach(System.out::println);
    }


}
