/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventaboleto;

/**
 *
 * @author Bere_
 */
import java.util.*;

public class VentaBoleto {

    
    private static final double PRECIO_GENERAL = 45.0;
    private static final double PRECIO_ESPECIAL = 42.0;
    private static final double PRECIO_ANTES_18 = 52.0;
    private static final double PRECIO_DESPUES_18 = 65.0;
    private static final double PRECIO_3D = 80.0;

    public static void main(String[] args) {
        VentaBoleto venta = new VentaBoleto();

        
        double costo = venta.calcularCosto("Pelicula", "Adulto", "3D", 3);
        System.out.println("El costo total es: " + costo);
    }

    public double calcularCosto(String pelicula, String categoria, String sala, int boletos) {
        double precioUnitario = PRECIO_GENERAL; // Precio por defecto

        // Determinar el precio de acuerdo a la categoría
        if (categoria.equals("Niño") || categoria.equals("Adulto Mayor")) {
            precioUnitario = PRECIO_ESPECIAL;
        } else if (categoria.equals("Adulto")) {
            precioUnitario = PRECIO_GENERAL;
        }

        // Precio para sala 3D
        if (sala.equals("3D")) {
            precioUnitario = PRECIO_3D;
        }

        // Aquí podrías agregar la lógica para las funciones antes o después de las 18:00
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        if (hora < 18) {
            precioUnitario = PRECIO_ANTES_18;
        } else {
            precioUnitario = PRECIO_DESPUES_18;
        }

        return precioUnitario * boletos;
    }
}
