import java.util.List;

public class estaOrdenada {

    public static void main(String[] args) {
        // Lista
        List<Integer> lista1 = List.of(1, 2, 3, 4, 5); // Ordenada
        List<Integer> lista2 = List.of(5, 3, 2, 4, 1); // No ordenada

        System.out.println("¿La lista #1 está ordenada? " + estaOrdenada(lista1)); // true
        System.out.println("¿La lista #2 está ordenada? " + estaOrdenada(lista2)); // false
    }
    public static boolean estaOrdenada(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}