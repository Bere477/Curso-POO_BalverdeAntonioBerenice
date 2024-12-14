/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

/**
 *
 * @author Bere_
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;

public class Interfaz extends JFrame {
    private JComboBox<String> comboPeliculas;
    private JComboBox<String> comboCategoria;
    private JComboBox<String> comboSala;
    private JTextField campoBoletos;
    private JButton calcularButton;
    private JTextArea resultadoArea;

    public Interfaz() {
        setTitle("Venta de Boletos de Cine");
        setLayout(new FlowLayout());

        // Elementos de la interfaz
        comboPeliculas = new JComboBox<>(new String[]{"Película 1", "Película 2", "Película 3"});
        comboCategoria = new JComboBox<>(new String[]{"Adulto", "Niño", "Adulto Mayor"});
        comboSala = new JComboBox<>(new String[]{"Normal", "3D"});
        campoBoletos = new JTextField(5);
        calcularButton = new JButton("Calcular Total");
        resultadoArea = new JTextArea(10, 30);
        resultadoArea.setEditable(false);

        // Elementos a la ventana
        add(new JLabel("Selecciona la película:"));
        add(comboPeliculas);
        add(new JLabel("Selecciona la categoría:"));
        add(comboCategoria);
        add(new JLabel("Número de boletos:"));
        add(campoBoletos);
        add(new JLabel("Tipo de sala:"));
        add(comboSala);
        add(calcularButton);
        add(new JScrollPane(resultadoArea));

        // Calcular el total
        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int boletos = Integer.parseInt(campoBoletos.getText());
                    String categoria = (String) comboCategoria.getSelectedItem();
                    String sala = (String) comboSala.getSelectedItem();

                    // Establecer precio base según la categoría
                    double precioBase = 0.0;
                    switch (categoria) {
                        case "Adulto":
                            precioBase = 100;
                            break;
                        case "Niño":
                            precioBase = 50;
                            break;
                        case "Adulto Mayor":
                            precioBase = 60;
                            break;
                    }

                    // Precio según el tipo de sala
                    if (sala.equals("3D")) {
                        precioBase += 30;  // Agregar extra por la sala 3D
                    }

                    // Si es después de las 7 PM, se aplica un descuento
                    LocalTime horaActual = LocalTime.now();
                    if (horaActual.isAfter(LocalTime.of(19, 0))) {
                        precioBase *= 0.9;  // Descuento del 10%
                    }

                    // Calcular el total
                    double total = precioBase * boletos;

                    // Mostrar el resultado
                    resultadoArea.setText("Total de la venta: $" + total);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido de boletos.");
                }
            }
        });

        // Configuración de la ventana
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Interfaz();
    }
}

