import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploFileNotFoundException {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Intentamos abrir un archivo que no existe
            reader = new BufferedReader(new FileReader("archivo.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException capturada: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException capturada: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}
