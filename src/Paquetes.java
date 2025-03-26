/**
 * Demostración de importe de paquetes sin concretar
 * java.awt.*: Contiene todas las clases para crear una interfaz de usuario y para pintar imagenes y graficos.
 * javax.naming.*: Contiene las clases e interfaces para acceder a servicios de nombres.
 * org.ietf.jgss.*: Contiene un framework que permite el uso de servicios de seguridad como autenticación, integridad y confidencialidad de datos, etc.
 * 
 * @author Diego Andrés Olivera Abarca
 * @version 1.0
 * @date 26 de marzo de 2025
 */
import java.awt.*;
import javax.naming.*;
import org.ietf.jgss.*;

public class Paquetes {
    public static void main(String[] args) {
        // Using java.awt package
        Point point = new Point(10, 20);
        System.out.println("Point coordinates: (" + point.x + ", " + point.y + ")");

        // Using javax.naming package
        Name name;
        try {
            name = new CompositeName("example/name");
            System.out.println("CompositeName: " + name);
        } catch (NamingException e) {
            System.out.println("NamingException occurred: " + e.getMessage());
        }

        // Using org.ietf package
        try {
            Oid oid = new Oid("1.2.840.113554.1.2.2");
            System.out.println("OID created: " + oid.toString());
        } catch (GSSException e) {
            System.out.println("GSSException occurred: " + e.getMessage());
        }
    }
}