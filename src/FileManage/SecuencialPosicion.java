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
    public static void main(String[] args) {
        String archivo = "ejemplo.txt";

        try (RandomAccessFile raf = new RandomAccessFile(archivo, "rw")) {
            raf.writeUTF("Primera línea\n");
            raf.writeUTF("Segunda línea\n");
            raf.writeUTF("Tercera línea\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        try (RandomAccessFile raf = new RandomAccessFile(archivo, "r")) {
            raf.seek(0);
            System.out.println("Línea 1: " + raf.readUTF());

            raf.seek(raf.getFilePointer());
            System.out.println("Línea 2: " + raf.readUTF());

            raf.seek(raf.getFilePointer());
            System.out.println("Línea 3: " + raf.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}