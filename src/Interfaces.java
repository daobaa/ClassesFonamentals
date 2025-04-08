/**
 * Ejemplos de uso de las interfaces.
 * 
 * @author Diego Andrés Olivera Abarca
 * @version 1.0
 * @date 08 de abril de 2025
 */
import java.util.*;

public class Interfaces {
    /**
     * Método que utiliza las diferentes interficies en pruebas.
     * 
     * @param lista Es un objeto de tipo List que mantiene las funcionalidades de una Array para crear una lista de nombres.
     * 
     * @param iteradorLista Es un objeto de tipo ListIterator que almacena los valores de la lista e imprime cada uno por separado.
     * 
     * @param conjunto Es un objeto de tipo Set que mantiene funcionalidades de un Hashset para utilizar la lista anterior.
     * 
     * @param conjuntoOrdenado Es un objeto de tipo SortedSet que mantiene funcionalidades de un TreeSet para organizar los elementos de la lista.
     * 
     * @param cola Es un objeto de tipo Queue que mantiene funcionalidades de un LinkedList para utilizar la lista anterior.
     * 
     * @param mapa Es un objeto de tipo Map que mantiene funcionalidades de un HashMap para crear un hasmap con datos como los de la lista anterior.
     * 
     * @param mapaOrdenado Es un objeto de tipo SortedMap que mantiene funcionalidades de un TreeMap para ordenar el Map anterior.
     * 
     * @param numeros Es un objeto de tipo List que mantiene funcionalidades de un Array para crear una lista de numeros.
     * 
     * @param iterador Es un objeto de tipo Iterator que utiliza el Set anterior para crear un iterador.
     * 
     * @return Devuelve un String que resume las operaciones realizadas: 
     * - La lista es iterada e impresa elemento a elemento.
     * - El conjunto elimina duplicados.
     * - El conjunto ordenado organiza los elementos.
     * - La cola procesa los elementos en orden FIFO.
     * - El mapa asocia claves y valores utilizando una tabla hash.
     * - El mapa ordenado organiza las claves en un orden específico.
     * - Los números son almacenados y manipulados en una lista ordenable mediante Comparable o Comparator.
     * - Finalmente, el iterador permite recorrer el conjunto.
     */
    public static void main(String[] args) {
        // List (acceso por posición) y ListIterator
        List<String> lista = new ArrayList<>(Arrays.asList("Ana", "Luis", "Diego"));
        ListIterator<String> iteradorLista = lista.listIterator();
        while(iteradorLista.hasNext()) System.out.println("List: " + iteradorLista.next());

        // Set
        Set<String> conjunto = new HashSet<>(lista);
        conjunto.add("Luis");
        System.out.println("Set: " + conjunto);

        // SortedSet
        SortedSet<String> conjuntoOrdenado = new TreeSet<>(lista);
        System.out.println("SortedSet: " + conjuntoOrdenado);

        // Queue
        Queue<String> cola = new LinkedList<>(lista);
        System.out.println("Queue poll: " + cola.poll());

        // Map
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Ana");
        mapa.put(2, "Luis");
        mapa.put(3, "Diego");
        System.out.println("Map: " + mapa);

        // SortedMap
        SortedMap<Integer, String> mapaOrdenado = new TreeMap<>(mapa);
        System.out.println("SortedMap: " + mapaOrdenado);

        // Comparable y Comparator
        List<Integer> numeros = Arrays.asList(3, 1, 2);
        Collections.sort(numeros);
        System.out.println("Comparable: " + numeros);
        numeros.sort(Comparator.reverseOrder());
        System.out.println("Comparator: " + numeros);

        // Iterator
        Iterator<String> iterador = conjunto.iterator();
        while (iterador.hasNext()) System.out.println("Iterator: " + iterador.next());
    }
}