/**
 * Uso de algoritmos mencionados en los metodos de las clases Arrays y Collections.
 * 
 * @author Diego Andrés Olivera Abarca
 * @version 1.0
 * @date 08 de abril de 2025
 */
import java.util.*;

public class Algoritmos {
        /**
     * Método principal que lee y escribe en un archivo utilizando BufferedWriter.
     * 
     * @param writer Es un objeto de tipo BufferedWriter encargado de la escritura.
     * 
     * @param .write Es un metodo que permite que el objeto escriba en secuencia.
     * 
     * @param scanner Es un objeto de tipo Scanner utilizado para agregar el input del usuario en la busqueda de una clave.
     * 
     * @param claveBuscada Es un String que almacena el input del usuario.
     * 
     * @param reader Es un objeto de tipo BufferedReader encargado de la lectura.
     * 
     * @param linea Es un String que almacena el contenido del archivo por lineas.
     * 
     * @param encontrado Es un Booleano marcado como false.
     * 
     * @return Devuelve un mensaje que resume las operaciones realizadas en el archivo:
     * - Escribe tres datos en posiciones específicas: 0, 50 y 100 del archivo.
     * - Realiza la búsqueda en el archivo utilizando posiciones concretas.
     * - Recupera los datos escritos desde las posiciones indicadas (0, 50 y 100).
     * - Imprime en pantalla los valores leídos desde las posiciones correspondientes del archivo.
     */
    public static void main(String[] args) {
        Arrays();
        Collections();
    }

    public static void Arrays() {
        int[] numeros = {5, 3, 8, 1};
        Arrays.sort(numeros);
        System.out.println("Arrays ordenados: " + Arrays.toString(numeros));

        int index = Arrays.binarySearch(numeros, 5);
        System.out.println("Índice en Arrays: " + index);

        int[] datos = new int[5];
        Arrays.fill(datos, 7);
        System.out.println("Arrays rellenados: " + Arrays.toString(datos));
    }

    public static void Collections() {
        List<String> nombres = Arrays.asList("Luis", "Ana", "Diego");
        Collections.sort(nombres);
        System.out.println("Collections ordenadas: " + nombres);

        int pos = Collections.binarySearch(nombres, "Diego");
        System.out.println("Posición en Collections: " + pos);

        Collections.reverse(nombres);
        System.out.println("Collections invertidas: " + nombres);
    }
}
