import java.util.Scanner;

public class   Controller_poliretos {
    Scanner IngresarValores = new Scanner(System.in);
        public void iniciar(){ 
            String valoresGenericos;
            Integer operaciones;
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
                System.out.println("|");
                System.out.println(secciones[i]);
                
            }

             }while  (); 
           
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
