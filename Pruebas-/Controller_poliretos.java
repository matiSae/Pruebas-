import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller_poliretos {
    public final String ROJO = "\u001B[31m";
    public final String RESET = "\u001B[0m";
    public final String VERDE = "\u001B[32m";
    
    Integer operaciones;
        public void iniciar(){ 
            Scanner ingresoDatos = null;
            try {
                ingresoDatos = new Scanner(System.in);
            int opcionGeneral = 0, continuar = 0, operacionARealizar = 0, seguirOperaciones = 0;
            
            String [] opcMenuPrincipal = {"1. Ver integrantes del grupo", "2. Ingresar al menú de operaciones", "3. Salir"};
            String [] secciones = {"1. Series numericas", "2. Series de caracteres", "3. Figuras", "4. Cadenas de caracteres", "5. Arrays", "6. Loading", "7. Recursion", "8. Grafos y automatas"};
            String [] integrantes = {"1. Matias Quinchiguango", "2. Micaela Sajal", "3. Michael Sotomayor", "4. Robbinson Tandazo", "5. Victoria Torres", "6. Sebastián Zúñiga"};
            
            boolean entradaValida, operacionValida, confirmacionValida;

            imprimirTitulo();
                 

        do{   
            imprimirMenu(opcMenuPrincipal, "menu general");
           entradaValida = false;
            do{
                
            try {
                System.out.println("Ingrese opción: ");
                opcionGeneral = ingresoDatos.nextInt();
                ingresoDatos.nextLine();

                if (opcionGeneral >= 1 && opcionGeneral <= 3){
                    entradaValida = true;
                }else{
                    imprimirErrorOpcionIncorrecta();
                }
                
            } catch (InputMismatchException e) {
                imprimirErrorDatosInvalidos();
                ingresoDatos.nextLine();
            }
            }while (!entradaValida);    
            

              
            
            switch (opcionGeneral) {
                case 1:
                    imprimirMenu(integrantes, "integrantes");
                    break;
                case 2:
                    do {
                        operacionValida = false;
                        imprimirMenu(secciones, "operaciones");
                        try {
                            operacionARealizar = ingresoDatos.nextInt();
                            ingresoDatos.nextLine();
                            if (operacionARealizar >= 1 && operacionARealizar <= 8){
                                operacionValida = true;
                            }
                        } catch (InputMismatchException e) {
                            imprimirErrorDatosInvalidos();
                            ingresoDatos.nextLine();
                        }
                        switch(operacionARealizar) {
                            case 1:
                                // Series numericas
                                break;
                            case 2:
                                // Series de caracteres
                                break;
                            case 3:
                                // Figuras
                                break;
                            case 4:
                                // Cadenas de caracteres
                                break;
                            case 5:
                                // Arrays
                                break;
                            case 6:
                                // Loading
                                break;
                            case 7:
                                // Recursion
                                break;
                            case 8:
                                // Grafos y automatas
                                break;
                            default:
                                imprimirErrorOpcionIncorrecta();
                                operacionARealizar = 0;
                                break;
                        }

                        if (operacionValida){
                            System.out.println("Si desea realizar otra operacción, digite 2. De lo contrario, digite 1.");
                            
                            do{
                                confirmacionValida = false;
                                try {
                                    seguirOperaciones = ingresoDatos.nextInt();
                                    ingresoDatos.nextLine();
                                    if (seguirOperaciones == 1 || seguirOperaciones == 2) confirmacionValida = true;
                                } catch (InputMismatchException e) {
                                    imprimirErrorDatosInvalidos();
                                    ingresoDatos.nextLine();
                                }
                                
                                if (!confirmacionValida) {
                                    imprimirErrorOpcionIncorrecta();
                                }
                            }while (!confirmacionValida);
                            
                        }
                    }while (!operacionValida || seguirOperaciones == 2);
                    break;
                case 3:
                    System.out.println("Usted ha salido del programa POLIRETOS - GRUPO 5");
                    break;
                default:
                    imprimirErrorOpcionIncorrecta();
                    break;
            }
        
            if (opcionGeneral != 3){
                System.out.println("Digite 1 para regresar al menú principal.");
                do {
                    entradaValida = false;
                try {
                    continuar = ingresoDatos.nextInt();
                    ingresoDatos.nextLine();
                    if (continuar == 1) entradaValida = true;
                } catch (InputMismatchException e) {
                    imprimirErrorDatosInvalidos();
                    ingresoDatos.nextLine();
                }
                } while (continuar != 1);
            }
           3
                
        }while (!entradaValida || opcionGeneral != 3);
            } finally {
                if (ingresoDatos != null) {
                    ingresoDatos.close();
                }
            }
    }
    


        public void imprimirErrorOpcionIncorrecta(){
            System.out.println(ROJO + "\n============= ERROR =============");
            System.out.println("La opción ingresada no es correcta. Intente nuevamente." + RESET + "\n");
        }

        public void imprimirErrorDatosInvalidos() {
            System.out.println(ROJO + "\n============= ERROR =============");
            System.out.println("El valor ingresado no es válido. Intente nuevamente." + RESET + "\n");
        }

    

        public void imprimirTitulo( ){
            
            String titulo = "================== POLIRETOS - GRUPO 5 ==================";
            System.out.println(ROJO + " ".repeat(15) + titulo + RESET);
            System.out.println(" ".repeat(30) + "Bienvenido a Poliretos.");
            System.out.println(" ".repeat(30) +"Por favor, elija una opción: ");   
            System.out.println();

        }

        public void imprimirMenu (String [] datos, String nombreMenu){
            
            String subtitulo = "============== " + nombreMenu.toUpperCase() + " =============";
            int offset = 60 - subtitulo.length();
            System.out.println(VERDE + " ".repeat(offset) + subtitulo + RESET);

            for (String elemento : datos){
                int espaciosDentro = subtitulo.length() - 2 - elemento.length();
                if (espaciosDentro < 0) espaciosDentro = 0;

                String textoMenu = "|" + elemento + " ".repeat(espaciosDentro) + "|";



                System.out.println(" ".repeat(offset) + textoMenu);
            }
            
            System.out.println(" ".repeat(offset) + "_".repeat(subtitulo.length()) + "\n");
        }

}
