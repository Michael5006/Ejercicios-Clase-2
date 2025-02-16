import java.util.ArrayList;
import java.util.List;

public class listasMultiplicacion {

    public static void main(String[] args) {
        // Lista
        List<Integer> lista1 = List.of(2, 4, 6); // Lista 1
        List<Integer> lista2 = List.of(1, 3, 5); // Lista 2

        List<Integer> resultado = listasMultiplicacion(lista1, lista2);

        // Imprimir el resultado
        System.out.println("Listas Multiplicadas: ");
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }

    public static List<Integer> listasMultiplicacion(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < lista1.size(); i++) {
            resultado.add(lista1.get(i) * lista2.get(i));
        }
        return resultado;
    }
}