package client;

import sort.Selection;
import util.ArrayUtils;

/**
 * La clase {@code Main} actúa como cliente para probar la implementación
 * del algoritmo de ordenamiento por selección.
 * <p>
 * Crea un arreglo de cadenas, lo ordena usando {@code Selection.sort()},
 * y luego verifica si está correctamente ordenado.
 * </p>
 * 
 * @author Sebastian Florez
 */
public class Main {

    /**
     * El método principal ejecuta la prueba del algoritmo de ordenamiento.
     * 
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Arreglo de cadenas de ejemplo
        String[] array = {"Zebra", "Apple", "Monkey", "Elephant", "Banana"};

        // Ordena el arreglo usando el algoritmo Selection Sort
        Selection.sort(array);

        // Verifica si el arreglo está ordenado e imprime el resultado
        System.out.println("Está ordenado: " + ArrayUtils.isSorted(array));
    }
}