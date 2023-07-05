public class EjemploExcepcion {
    public static void main(String[] args) {
        try {
            // Lanzar una excepción personalizada
            throw new MiExcepcion("Ocurrió un error personalizado.");
        } catch (MiExcepcion e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}

class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}
