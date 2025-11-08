public class   Controller_poliretos {
        public void iniciar(){ 
            final String ROJO = "\u001B[31m";
            final String RESET = "\u001B[0m";
            final String VERDE = "\u001B[32m";

            String [] secciones = {"1. Series numericas", "2. Series de caracteres", "3. Figuras", "4. Cadenas de caracteres", "5. Arrays", "6. Loading", "7. Recursion", "8. Grafos y automatas"};
            
        do{
            System.out.printf("%70s%n", ROJO + "============== POLIRETOS ==============" + RESET);
            System.out.printf("%54s%n", "Bienvenido a Poliretos.");
            System.out.println();
            System.out.printf("%63s%n", VERDE + "====== MENU DE OPERACIONES =====");

            for (int i = 0; i < secciones.length; i++){
                System.out.print("|");
                System.out.println(secciones[i]);
                " ".repeat(32 - secciones[i].length());
                System.out.println("|");
            }

        }while   
           
        }

}
