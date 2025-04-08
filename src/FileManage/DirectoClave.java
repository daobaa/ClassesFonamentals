/**
 * Acceso a un archivo de forma directa por clave.
 * 
 * @author Diego Andrés Olivera Abarca
 * @version 1.0
 * @date 08 de abril de 2025
 */
package FileManage;

import java.io.*;
import java.util.Scanner;

public class DirectoClave {
    /**
     * Método principal que escribe y lee en un archivo mediante RandomAccessFile.
     * 
     * @param rafW Es un objeto de tipo RandomAccessFile encargado de la lectura.
     * 
     * @param .seek Es un método que mueve el puntero del archivo a la posición deseada.
     * 
     * @param scanner Es un objeto de tipo Scanner utilizado para agregar el input del usuario en la busqueda de la clave.
     * 
     * @param claveBuscada Es un String que almacena el input del usuario.
     * 
     * Condiciones y Resultados:
     * <ul>
     *  <li>Si la clave corresponde a una posición válida en el archivo:
     *      <ul>
     *          <li>El puntero se mueve a dicha posición utilizando el método .seek.</li>
     *          <li>Se imprime en pantalla el registro correspondiente a la clave.</li>
     *      </ul>
     *  </li>
     *  <li>Si la clave no corresponde a una posición válida en el archivo:
     *      <ul>
     *          <li>Se imprime en pantalla un mensaje de error indicando que la clave no es válida.</li>
     *      </ul>
     *  </li>
     * </ul>
     */
    public static void main(String[] args) {
        String archivo = "accesoDirecto.dat";

        try (RandomAccessFile rafW = new RandomAccessFile(archivo, "rw")) {
            rafW.seek(0);
            rafW.writeUTF("1|Diego|30");

            rafW.seek(50);
            rafW.writeUTF("2|Ana|25");

            rafW.seek(100);
            rafW.writeUTF("3|Luis|40");

            rafW.seek(150);
            rafW.writeUTF("4|Eva|35");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la clave que deseas buscar (1-4): ");
        String claveBuscada = scanner.nextLine();

        try (RandomAccessFile rafR = new RandomAccessFile(archivo, "r")) {
            long posicion = -1;

            switch (claveBuscada) {
                case "1":
                    posicion = 0;
                    break;
                case "2":
                    posicion = 50;
                    break;
                case "3":
                    posicion = 100;
                    break;
                case "4":
                    posicion = 150;
                    break;
                default:
                    System.out.println("La clave ingresada no corresponde a ningún registro disponible.");
                    System.out.println("Las claves válidas son: 1, 2, 3, 4.");
                    scanner.close();
                    return;
            }

            rafR.seek(posicion);
            System.out.println("Registro encontrado: " + rafR.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
