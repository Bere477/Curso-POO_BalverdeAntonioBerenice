import java.util.Scanner;




  public class Arreglos2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Promedio de valores positivos y negativos de un array
        System.out.println("### Promedio de valores positivos y negativos de un array ###");
        int[] numeros = new int[10];
        int sumaPositivos = 0, sumaNegativos = 0;
        int cantidadPositivos = 0, cantidadNegativos = 0;

        // Leer los 10 números desde el teclado
        System.out.println("Ingresa 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingresa un número entero válido.");
                }
            }
        }

        // Calcular promedios de números positivos y negativos
        for (int numero : numeros) {
            if (numero > 0) {
                sumaPositivos += numero;
                cantidadPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                cantidadNegativos++;
            }
        }

        // Mostrar promedios de positivos y negativos
        if (cantidadPositivos > 0) {
            System.out.println("Promedio de números positivos: " + (double) sumaPositivos / cantidadPositivos);
        } else {
            System.out.println("No hay números positivos.");
        }

        if (cantidadNegativos > 0) {
            System.out.println("Promedio de números negativos: " + (double) sumaNegativos / cantidadNegativos);
        } else {
            System.out.println("No hay números negativos.");
        }

        // 2. Promedio de valores en posiciones pares de un array
        System.out.println("\n### Promedio de valores en posiciones pares de un array ###");
        sumaPositivos = 0; // reutilizar variable
        int cantidadPares = 0;

        // Leer los 10 números para posiciones pares
        System.out.println("Ingresa 10 números enteros para posiciones pares:");
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingresa un número entero válido.");
                }
            }
        }

        // Calcular el promedio de los números en posiciones pares
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) { // Índices pares (0, 2, 4, 6, 8)
                sumaPositivos += numeros[i];
                cantidadPares++;
            }
        }

        // Mostrar el resultado
        if (cantidadPares > 0) {
            System.out.println("Promedio de números en posiciones pares: " + (double) sumaPositivos / cantidadPares);
        } else {
            System.out.println("No hay números en posiciones pares.");
        }

        // 3. Suma de matrices 3x3
        System.out.println("\n### Suma de matrices 3x3 ###");
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizS = new int[3][3];

        // Leer la primera matriz (matriz A)
        System.out.println("Ingresa los valores de la matriz A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                while (true) {
                    try {
                        System.out.print("Elemento A[" + i + "][" + j + "]: ");
                        matrizA[i][j] = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, ingresa un número entero válido.");
                    }
                }
            }
        }

        // Leer la segunda matriz (matriz B)
        System.out.println("Ingresa los valores de la matriz B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                while (true) {
                    try {
                        System.out.print("Elemento B[" + i + "][" + j + "]: ");
                        matrizB[i][j] = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, ingresa un número entero válido.");
                    }
                }
            }
        }

        // Sumar las matrices A y B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizS[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Mostrar las matrices A, B y la suma S
        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);

        System.out.println("Matriz B:");
        mostrarMatriz(matrizB);

        System.out.println("Matriz S (Suma de A y B):");
        mostrarMatriz(matrizS);
    }

    // Función para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
