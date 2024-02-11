import java.util.ArrayList;
import java.util.Arrays;

public class RepartiendoRegalos {
    public static void main(String[] args) {
        ArrayList<Integer> portales = new ArrayList<>(Arrays.asList(2,4,7));
        System.out.println(visita(3, portales));
    }

    public static String visita(int aterriza, ArrayList<Integer> portales){
        StringBuilder resultado = new StringBuilder();
        while (!portales.isEmpty()){
            int portal = encuentraPortal(aterriza, portales);
            aterriza = portales.get(portal);
            resultado.append(aterriza).append(" ");
            portales.remove(portal);
        }
        return resultado.toString();
    }

    public static int encuentraPortal(int aterriza, ArrayList<Integer> portales){
        int portal = 0;
        int menorDistancia = Integer.MAX_VALUE;
        for (int i = 0; i < portales.size(); i++) {
            int distancia = Math.abs(portales.get(i) - aterriza);
            if (distancia < menorDistancia || (distancia == menorDistancia && portales.get(i) > portales.get(portal))){
                menorDistancia = distancia;
                portal = i;
            }
        }
        return portal;
    }
}
