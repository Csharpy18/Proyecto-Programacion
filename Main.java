import java.util.Scanner;

public class Main
{
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do{

            System.out.println("Bienvenido al sistema de \nElecciones presidenciales en Costa Rica 2026");
            System.out.println("Estan son sus opciones, ingrese el número \ncorrespondiente a lo que desea hacer\n");
            System.out.println("1. Incluir un partido \n2. Incluir un candidato \n3. Incluir un votante \n4. Registrar un voto \n5. Salir ");
            
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("En construcción");
                    break;
                case 2:
                    System.out.println("En construcción");
                    break;
                case 3:
                    System.out.println("En construcción");
                    break;
                case 4:
                    System.out.println("En construcción");
                    break;
                case 5:
                    System.out.println("Apagando el sistema");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            
            
        }while(opcion != 5);
    
    
    }
}