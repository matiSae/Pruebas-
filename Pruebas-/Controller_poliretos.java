public class   Controller_poliretos {
        public void iniciar(){ 
            final String ROJO = "\u001B[31m";
            final String RESET = "\u001B[0m";
            final String VERDE = "\u001B[32m";

            String titulo = "============== POLIRETOS ==============";
            int ancho = 80; // ancho promedio del terminal

            int espacios = (ancho - titulo.length()) / 2;

            System.out.printf("%70s%n", ROJO + "============== POLIRETOS ==============" + RESET);
            System.out.printf("%54s%n", "Bienvenido a Poliretos.");
            System.out.println();
            System.out.printf("%63s%n", VERDE + "====== MENU DE OPERACIONES =====");
        }

}
