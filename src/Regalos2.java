import java.util.*;

public class Regalos2 {
    public static void main(String[] args) {
        List<Integer> portales = new ArrayList<>(Arrays.asList(2,4,7));
        System.out.println(visita(3, portales));
    }

    public static String visita(int aterriza, List<Integer> portales) {
        StringBuilder resultado = new StringBuilder();
        while (!portales.isEmpty()) {
            int portal = encuentraPortal(aterriza, portales);
            aterriza = portales.get(portal);
            resultado.append(aterriza).append(" ");
            portales.remove(portal);
        }
        return resultado.toString();
    }

    private static int encuentraPortal(int aterriza, List<Integer> portales) {
        int portal = 0;
        int menorDistancia = Integer.MAX_VALUE;
        for (int i = 0; i < portales.size(); i++) {
            int distancia = Math.abs(portales.get(i) - aterriza);
            if (distancia < menorDistancia || (distancia == menorDistancia && portales.get(i) > portales.get(portal))) {
                menorDistancia = distancia;
                portal = i;
            }
        }
        return portal;
    }
}
