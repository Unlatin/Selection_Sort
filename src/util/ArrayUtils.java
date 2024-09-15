package util;

/**
 * La clase {@code ArrayUtils} proporciona métodos de utilidad
 * para manipular y verificar el contenido de arreglos.
 * <p>
 * Los métodos aquí definidos son usados principalmente para
 * mostrar el contenido de un arreglo y para verificar si está
 * correctamente ordenado.
 * </p>
 * 
 * @author Sebastian Florez
 */
public class ArrayUtils {

    /**
     * Muestra el contenido de un arreglo en la consola.
     * 
     * @param a el arreglo cuyos elementos se desean mostrar
     */
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); // Imprime cada elemento seguido de un espacio
        }
        System.out.println(); // Nueva línea después de imprimir todos los elementos
    }

    /**
     * Verifica si el arreglo está ordenado en orden ascendente.
     * 
     * @param a el arreglo que se desea verificar
     * @return true si el arreglo está ordenado
     */
    public static boolean isSorted(Comparable[] a) {
        // Recorre el arreglo comparando cada elemento con el anterior
        for (int i = 1; i < a.length; i++) {
            // Si encuentra un elemento desordenado, devuelve false
            if (a[i].compareTo(a[i - 1]) < 0) {
                return false;
            }
        }
        return true; // Si no encuentra desorden, devuelve true
    }
}