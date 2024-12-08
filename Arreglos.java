import java.util.Scanner;



public class Arreglos{
 public static void main(String[] args) {
    
    
    int arreglo[] = new int[10];
    int valor;
    int sumaPositivos = 0, sumaNegativos = 0;
    int conteoPositivos = 0, conteoNegativos = 0;
   

    Scanner entrada = new Scanner(System.in);
    /*
    //Ingresar valores al arreglo
    for(int i = 0; i < arreglo.length; i++ ){

     System.out.println("Ingresa un valor entero: ");   
     arreglo[i] = entrada.nextInt();

      if (arreglo[i] > 0) {
                sumaPositivos += arreglo[i];
                conteoPositivos++;

    }  else if (arreglo[i] < 0) {
                sumaNegativos += arreglo[i];
                conteoNegativos++;
 }   
       double promedioPositivos = conteoPositivos > 0 ? (double) sumaPositivos / conteoPositivos : 0;
       double promedioNegativos = conteoNegativos > 0 ? (double) sumaNegativos / conteoNegativos : 0;

        System.out.println("Promedio de números positivos: " + promedioPositivos);
        System.out.println("Promedio de números negativos: " + promedioNegativos);

}

     //Promedio de valores en posiciones pares
     int sumaPares = 0;
     int conteoPares = 0;

        for (int i = 0; i < 10; i++) {

        System.out.println("Ingresa 10 valores enteros:");  
         arreglo[i] = entrada.nextInt();
         if (i % 2 == 0) { 
                sumaPares += arreglo[i];
                conteoPares++; 
         }
 }
       double promedio = conteoPares > 0 ? (double) sumaPares / conteoPares : 0;
       System.out.println("Promedio de los valores en posiciones pares: " + promedioPares);
       */

      //Suma de matrices
       int matriz[][] = new int [3][3];
       for (int i = 0; i < matriz.length; i++){
           System.out.println("Posicion de los elementos de la matriz:" +i); 

      //Columnas
       for (int j = 0; j < matriz.length; j++){

      System.out.println("Ingresa el valor de la fila:" + i + "Ingresa el valor de la columna:" +j);
      matriz [i][j] = entrada.nextInt();


       }
   }     

 //Mostrar
 //Suma de matrices
       int matrix[][] = new int [3][3];
       for (int i = 0; i < matrix.length; i++){
           System.out.println("Posicion de los elementos de la matrix:" +i); 

      //Columnas
       for (int j = 0; j < matrix.length; j++){

      System.out.print(String.format("%d" , matrix [i][j]));
     


       }
         System.out.println();
   }



}
}
