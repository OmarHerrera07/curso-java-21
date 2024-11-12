import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Amigos {
    private static final Map<Integer, String> nombresAmigos;

    static {
        Map<Integer, String> tempMap = new HashMap<>();
        tempMap.put(1, "Carlos");
        tempMap.put(2, "Lucía");
        tempMap.put(3, "Miguel");
        nombresAmigos = Collections.unmodifiableMap(tempMap);
    }

    public static String obtenerNombre(int numero) {
        return nombresAmigos.get(numero);
    }

    public static Map<Integer, String> obtenerTodosLosNombres() {
        return nombresAmigos;
    }

    public static void main(String[] args) {
        System.out.println("Nombre del amigo número 1: " + Amigos.obtenerNombre(1));
        System.out.println("Todos los nombres de amigos: " + Amigos.obtenerTodosLosNombres());
    }
}
