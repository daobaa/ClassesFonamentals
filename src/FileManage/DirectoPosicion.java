/**
 * Acceso a un archivo de forma directa por posición.
 * 
 * @author Diego Andrés Olivera Abarca
 * @version 1.0
 * @date 08 de abril de 2025
 */
package FileManage;

import java.io.*;

public class DirectoPosicion {
    /**
     * Método principal que lee y escribe en un archivo utilizando RandomAccessFile.
     * 
     * @param rafW Es un objeto de tipo RandomAccesFile encargado de la escritura.
     * 
     * @param .seek Es un metodo que permite que el objeto busque en una posición concreta del archivo.
     * 
     * @param .write Es un metodo que permite que el objeto escriba en la posición previamente indicada.
     * 
     * @param rafR Es un objeto de tipo RandomAccessFile encargado de la lectura por posición en el archivo.
     * 
     * @return Este método no devuelve un valor, pero realiza las siguientes operaciones:
     * - Escribe datos específicos en el archivo en posiciones concretas: 0, 50 y 100.
     * - Mueve el puntero del archivo mediante el método .seek para ubicar cada posición correspondiente.
     * - Recupera los datos almacenados previamente desde las posiciones especificadas.
     * - Imprime en pantalla el contenido leído desde cada posición del archivo, mostrando los registros tal como fueron escritos.
     * - Si ocurre alguna excepción durante la operación (lectura o escritura), imprime el stack trace para facilitar la depuración.
     */
    public static void main(String[] args) {
        String archivo = "accesoDirecto.txt";

        try (RandomAccessFile rafW = new RandomAccessFile(archivo, "rw")) {
            rafW.seek(0);
            rafW.writeUTF("Dato en posición 0");

            rafW.seek(50);
            rafW.writeUTF("Dato en posición 50");

            rafW.seek(100);
            rafW.writeUTF("Dato en posición 100");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (RandomAccessFile rafR = new RandomAccessFile(archivo, "r")) {
            rafR.seek(0);
            System.out.println("Leído desde posición 0: " + rafR.readUTF());

            rafR.seek(50);
            System.out.println("Leído desde posición 50: " + rafR.readUTF());

            rafR.seek(100);
            System.out.println("Leído desde posición 100: " + rafR.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}