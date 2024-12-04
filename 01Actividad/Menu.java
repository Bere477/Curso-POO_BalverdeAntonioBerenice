import java.util.Scanner;

public class Menu{
 

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int opcion;
        char letra;
        

        do {
            System.out.println("Bienvenido al menu interactivo");
            System.out.println("1. Calculadora");
            System.out.println("2. Convertidor de unidades");
            System.out.println("3. Salir");

            opcion = entrada.nextInt();

        //menu

                   switch (opcion) {
                case 1:
                    System.out.println("Calculadora:");
                    System.out.println("1. Suma");
                    System.out.println("2. Resta");
                    System.out.println("3. Multiplicación");
                    System.out.println("4. División");
                    System.out.println("5. División con residuo");
                    System.out.print("Selecciona una operación: ");

                    int operacion = entrada.nextInt();

                    System.out.print("Introduce el primer número: ");
                    double num1 = entrada.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    double num2 = entrada.nextDouble();


                    switch (operacion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println("Cociente: " + ((int) num1 / (int) num2));
                    System.out.println("Residuo: " + ((int) num1 % (int) num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                break;
            }
             break;
              
                    case 2:
                    System.out.println("\nConvertidor de Unidades:");
                    System.out.println("1. Longitud (metros a centímetros y pulgadas)");
                    System.out.println("2. Masa (kilogramos a libras y gramos)");
                    System.out.println("3. Velocidad (metros/segundo a kilómetros/hora)");
                    System.out.print("Selecciona una categoría: ");  

                    int categoria = entrada.nextInt();

                    switch (categoria) {
            case 1:
                System.out.print("Introduce la longitud en metros: ");
                double metros = entrada.nextDouble();
                System.out.println(metros + " m = " + (metros * 100) + " cm");
                System.out.println(metros + " m = " + (metros * 39.3701) + " pulgadas");
                break;
            case 2:
                System.out.print("Introduce la masa en kilogramos: ");
                double kilogramos = entrada.nextDouble();
                System.out.println(kilogramos + " kg = " + (kilogramos * 1000) + " g");
                System.out.println(kilogramos + " kg = " + (kilogramos * 2.20462) + " libras");
                break;
            case 3:
                System.out.print("Introduce la velocidad en metros/segundo: ");
                double velocidad = entrada.nextDouble();
                System.out.println(velocidad + " m/s = " + (velocidad * 3.6) + " km/h");
                break;
            default:
                System.out.println("Categoría no válida.");

                }
                break;

                 case 3:
                    System.out.println("¡Vuelva pronto! :3.");
                    return;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

                     
                System.out.println("¿Desea repetir el programa? (s/n)");
                letra = entrada.next().charAt(0);
            
        } while (letra == 's' || letra == 'S'); 

        entrada.close(); 
    }
}
