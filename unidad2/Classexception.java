public class EjemploClassCastException {
    public static void main(String[] args) {
        try {
            // Intentamos realizar una conversión incorrecta de tipos
            Object obj = "Hola";
            Integer num = (Integer) obj;
            System.out.println("Número: " + num);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException capturada: " + e.getMessage());
        }
    }
}
