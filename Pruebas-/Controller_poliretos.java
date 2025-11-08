import java.util.Scanner;

public class   Controller_poliretos {
    Scanner IngresarValores = new Scanner(System.in);
        public void iniciar(){ 
            String valoresGenericos;
            Integer operaciones;
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

            do{ 
            valoresGenericos = IngresarValores.nextLine(); 
            operaciones =Integer.parseInt(valoresGenericos);
            }while(operaciones <1 || operaciones >8);    
            switch (operaciones) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:

                    break;
            }
        }

}
