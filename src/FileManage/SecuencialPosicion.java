/**
 * Acceso a un archivo de forma secuencial por posición.
 * 
 * @author Diego Andrés Olivera Abarca
 * @version 1.0
 * @date 02 de abril de 2025
 */
package FileManage;

import java.io.*;

public class SecuencialPosicion {
    /**
     * Método principal que lee y escribe en un archivo utilizando RandomAccessFile.
     * 
     * @param rafW Un objeto de tipo RandomAccessFile encargado de la escritura en el archivo.
     * 
     * @param rafR Un objeto de tipo RandomAccessFile encargado de la lectura del archivo por posicion.
     * 
     * @return 3 lineas mostrando el contenido del archivo de forma secuencial por posicion.
     */
    public static void main(String[] args) {
        String archivo = "ejemplo.txt";

        try (RandomAccessFile rafW = new RandomAccessFile(archivo, "rw")) {
            rafW.writeUTF("Primera línea\n");
            rafW.writeUTF("Segunda línea\n");
            rafW.writeUTF("Tercera línea\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        try (RandomAccessFile rafR = new RandomAccessFile(archivo, "r")) {
            rafR.seek(0);
            System.out.println("Línea 1: " + rafR.readUTF());

            rafR.seek(rafR.getFilePointer());
            System.out.println("Línea 2: " + rafR.readUTF());

            rafR.seek(rafR.getFilePointer());
            System.out.println("Línea 3: " + rafR.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}