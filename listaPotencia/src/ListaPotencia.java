import java.util.ArrayList;
import java.util.List;

public class ListaPotencia {
    public static List<Integer> listaPotencia(int exponente, List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) {
            resultado.add((int) Math.pow(numero, exponente));
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 4, 5);
        int exponente = 2;
        List<Integer> resultado = listaPotencia(exponente, numeros);

        System.out.println("Lista original: " + numeros);
        System.out.println("Lista con potencia " + exponente + ": " + resultado);
    }
}
