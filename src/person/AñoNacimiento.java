package person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AñoNacimiento {
    public static void main(String[] args) {
        Person p1 = new Person("Juan","aa",1990);
        Person p2 = new Person("Eddy","bb",1998);
        Person p3 = new Person("Pepe","cc",2010);

        List<Person> personas = new ArrayList<>(Arrays.asList(p1,p2,p3));

        double media = personas.stream().mapToInt(Person::getBirthYear).average().orElse(0.0);
        System.out.println(media);
    }
}
