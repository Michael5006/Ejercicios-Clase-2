import java.util.List;

public class calcularPromedio {

    public static void main(String[] args) {
        // Lista
        List<Double> lista = List.of(2.5, 4.0, 4.5, 5.0, 2.0);

        double promedio = calcularPromedio(lista);

        // Resultado
        System.out.println("Las notas digitadas son: " +lista);
        System.out.println("El promedio de la lista es: " + promedio);
    }

    public static double calcularPromedio(List<Double> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía, no se puede calcular el promedio.");
            return 0.0;
        }

        double suma = 0.0;
        for (double numero : lista) {
            suma += numero;
        }

        return suma / lista.size();
    }
}