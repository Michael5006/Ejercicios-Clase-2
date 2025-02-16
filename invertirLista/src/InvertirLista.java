import java.util.ArrayList;
import java.util.List;

public class InvertirLista {

    public static void main(String[] args) {
        // Lista
        List<Integer> lista = List.of(100, 200, 300, 400, 500);

        List<Integer> listaInvertida = invertirLista(lista);

        // Resultados
        System.out.println("Lista original: " + lista);
        System.out.println("Lista invertida: " + listaInvertida);
    }

    public static List<Integer> invertirLista(List<Integer> lista) {
        List<Integer> listaInvertida = new ArrayList<>();

        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertida.add(lista.get(i));
        }

        return listaInvertida;
    }
}