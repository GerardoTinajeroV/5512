public class EjemploNullPointerException {
    public static void main(String[] args) {
        String str = null;

        try {
            // Intentamos acceder a un método de un objeto nulo
            int length = str.length();
            System.out.println("Longitud de la cadena: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException capturada: " + e.getMessage());
        }
    }
}
