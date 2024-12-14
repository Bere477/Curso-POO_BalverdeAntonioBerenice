/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this templat
/**
 *
 * @author Bere_
 */

import java.io.*;
import java.util.*;

public class ArchivoDatos implements Serializable {  

    // Método para guardar datos
    public static void guardarDatos(List<ArchivoDatos> Datos) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Datos.dat"))) {
            out.writeObject(Datos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para recuperar datos
    public static List<ArchivoDatos> recuperarDatos() {
        List<ArchivoDatos> Datos = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ventas.dat"))) {
            Datos = (List<ArchivoDatos>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
        return Datos;
    }

    // Método principal (main) para probar los métodos
    public static void main(String[] args) {
        List<ArchivoDatos> listaDatos = new ArrayList<>();
        
        // Agregar algunos datos de ejemplo
        listaDatos.add(new ArchivoDatos());  // Suponiendo que ArchivoDatos tiene un constructor vacío

        // Guardar datos
        guardarDatos(listaDatos);

        // Recuperar datos
        List<ArchivoDatos> recuperados = recuperarDatos();
        System.out.println("Datos recuperados: " + recuperados.size());
    }
}

