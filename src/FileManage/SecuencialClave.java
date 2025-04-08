/**
 * Acceso a un archivo de forma secuencial por clave.
 * 
 * @author Diego Andrés Olivera Abarca
 * @version 1.1
 * @date 08 de abril de 2025
 */
package FileManage;

import java.io.*;
import java.util.Scanner;

public class SecuencialClave {
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
     * @return No devuelve ningún valor directamente, pero imprime en pantalla el resultado de la búsqueda.
     * 
     * Condiciones y Resultados:
     * <ul>
     *  <li>Si el numero se encuentra en el archivo previo al primer "|", cambia su valor a true.
     *      <ul>
     *          <li>Seguidamente se imprime en pantallla el valor de la linea.</li>
     *      </ul>
     *  </li>
     *  <li>Si el numero no se encuentra en el archivo previo al primer "|", su valor se mantiene en false.
     *      <ul>
     *          <li>Entonces en el segundo if se imprimirá en pantalla el mensaje de fallo y terminará el programa.</li>
     *      </ul>
     *  </li>
     * </ul>
     */
    public static void main(String[] args) {
        String archivo = "registros.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write("1|Diego|30\n");
            writer.write("2|Ana|25\n");
            writer.write("3|Luis|40\n");
            writer.write("4|Eva|35\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la clave que deseas buscar (1-4): ");
        String claveBuscada = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean encontrado = false;

            while ((linea = reader.readLine()) != null) {

                String[] partes = linea.split("\\|");
                String clave = partes[0];

                if (clave.equals(claveBuscada)) {
                    encontrado = true;
                    System.out.println("Registro encontrado: " + linea);
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("La clave ingresada no corresponde a ningún registro disponible.");
                System.out.println("Las claves válidas son: 1, 2, 3, 4.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}