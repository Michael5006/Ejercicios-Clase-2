import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class eliminarDuplicados {

    public static void main(String[] args) {
        // Lista
        List<Integer> lista = List.of(100, 200, 200, 300, 450, 450, 530, 530, 530);

        List<Integer> listaSinDuplicados = eliminarDuplicados(lista);

        // Resultados
        System.out.println("Lista original: " + lista);
        System.out.println("Lista sin duplicados: " + listaSinDuplicados);
    }

    public static List<Integer> eliminarDuplicados(List<Integer> lista) {
        Set<Integer> conjunto = new TreeSet<>(lista);
        return new ArrayList<>(conjunto);
    }
}