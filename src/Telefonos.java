import java.util.*;

public class Telefonos {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> agenda = new HashMap<>();
        agenda.put("Juan",Arrays.asList(111,112));
        agenda.put("Pepe",Arrays.asList(222,223));
        agenda.put("Xin",Arrays.asList(333,334));

        System.out.println("Introduce un contacto: ");
        Scanner tc = new Scanner(System.in);
        String contacto = tc.nextLine();

        System.out.println(agenda.getOrDefault(contacto,null));

    }

}
