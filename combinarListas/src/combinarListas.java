import java.util.ArrayList;
import java.util.List;

public class combinarListas {

    public static void main(String[] args) {
        // Listas
        List<Integer> lista1 = List.of(10, 20, 30);
        List<Integer> lista2 = List.of(40, 50, 60);

        List<Integer> listaCombinada = combinarListas(lista1, lista2);

        // Resultado
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista combinada: " + listaCombinada);
    }

    public static List<Integer> combinarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaCombinada = new ArrayList<>();
        listaCombinada.addAll(lista1);
        listaCombinada.addAll(lista2);
        return listaCombinada;
    }
}