package sort;

import util.ArrayUtils;

/**
 * La clase {@code Selection} implementa el algoritmo de ordenamiento
 * por selección (*Selection Sort*).
 * <p>
 * Este algoritmo ordena un arreglo de elementos que implementen la interfaz
 * {@code Comparable}, seleccionando iterativamente el elemento más pequeño
 * y colocándolo en la posición correspondiente.
 * </p>
 * 
 * @author Sebastian Florez
 */
public class Selection {

    /**
     * Ordena el arreglo utilizando el algoritmo de selección.
     * 
     * @param a el arreglo que se desea ordenar
     */
    public static void sort(Comparable[] a) {
        int n = a.length; // Obtiene el tamaño del arreglo

        // Bucle externo: recorre cada posición del arreglo
        for (int i = 0; i < n; i++) {
            int min = i; // Asume que el elemento en la posición 'i' es el menor
            
            // Bucle interno: busca el elemento más pequeño en el resto del arreglo
            for (int j = i + 1; j < n; j++) {
                // Compara el elemento en j con el elemento mínimo actual
                if (less(a[j], a[min])) {
                    min = j; // Actualiza el índice del elemento más pequeño
                }
            }
            
            // Intercambia el elemento en la posición 'i' con el más pequeño encontrado
            exch(a, i, min);
            
            // Muestra el estado actual del arreglo después de cada intercambio
            ArrayUtils.show(a);
        }
    }

    /**
     * Compara si un elemento es menor que otro.
     * 
     * @param v el primer elemento a comparar
     * @param w el segundo elemento a comparar
     * @return true si el primer elemento es menor que el segundo
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * Intercambia dos elementos en el arreglo.
     * 
     * @param a el arreglo donde se realiza el intercambio
     * @param i el índice del primer elemento
     * @param j el índice del segundo elemento
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i]; // Guarda temporalmente el valor de a[i]
        a[i] = a[j]; // Asigna el valor de a[j] en a[i]
        a[j] = temp; // Asigna el valor temporal en a[j]
    }
}