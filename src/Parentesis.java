import java.util.EmptyStackException;
import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        String parentesis = "{([])}[{}]{}";

        try {
            Stack<Character> pila = new Stack<>();
            char posicion;
            for (int i = 0; i < parentesis.length(); i++) {
                posicion = parentesis.charAt(i);

                if (cerrado(posicion) && pila.isEmpty()){
                    System.out.println("Esta mal parentizado");
                } else if (abierto(posicion)) {
                    pila.push(posicion);
                } else if (cerrado(posicion)) {
                    if (comprobacion(posicion,pila.peek(),pila)){
                        pila.pop();
                    }
                }
            }
            if (pila.isEmpty()){
                System.out.println("Esta bien parentizada");
            }else {
                System.out.println("Esta mal parentizada");
            }

        }catch (EmptyStackException e){
            System.out.println("La pila esta vacia");
        }
    }

    public static boolean abierto(char posicion){
        return posicion == '(' || posicion == '[' || posicion == '{';
    }
    public static boolean cerrado(char posicion){
        return  posicion == ')' || posicion == ']' ||posicion == '}';
    }
    public static boolean comprobacion(char posicion, char posicionPila,Stack<Character> pila)throws EmptyStackException{
        posicionPila = pila.peek();
        if (posicion == ')'){
            return  posicionPila == '(';
        } else if (posicion == ']') {
            return posicionPila == '[';
        } else if (posicion == '}') {
            return posicionPila == '{';
        }else {
            return false;
        }
    }
}
