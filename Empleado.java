import java.util.Scanner;

public class Empleado {

    // Atributos de la clase
    private int idEmpleado;
    private String nombreEmpleado;
    private String puesto;
    private double[] sueldoQuincenal; 

    
    public Empleado() {
        this.sueldoQuincenal = new double[10];
    }

    // Método para validar los datos ingresados
    public boolean validarDatos(int idEmpleado, String nombreEmpleado, String puesto) {
        if (idEmpleado <= 0) {
            System.out.println("ID de empleado inválido.");
            return false;
        }

        // Validar nombre no vacío
        if (nombreEmpleado.trim().isEmpty()) {
            System.out.println("El nombre del empleado no puede estar vacío.");
            return false;
        }

        // Validar que el puesto sea válido
        if (!(puesto.equalsIgnoreCase("Empleado") || puesto.equalsIgnoreCase("Supervisor"))) {
            System.out.println("Puesto inválido. Debe ser 'Empleado' o 'Supervisor'.");
            return false;
        }

        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.puesto = puesto;
        return true;
    }

    // Calcular el sueldo según el puesto
    public double calcularSueldo(double horasExtrasDiurnas, double horasExtrasNocturnas) {
        double sueldo = 0;

        if (puesto.equalsIgnoreCase("Empleado")) {
            // Sueldo base para empleado + horas extras
            sueldo = 5000 + (horasExtrasDiurnas * 50) + (horasExtrasNocturnas * 60);
        } else if (puesto.equalsIgnoreCase("Supervisor")) {
            // Sueldo base para supervisor
            sueldo = 8000;
            
            sueldo -= sueldo * 0.002; // INFONAVIT 
            sueldo -= sueldo * 0.001; // Seguro de Gastos Médicos 
            sueldo -= sueldo * 0.0016; // ISR 
        }

        return sueldo;
    }

    // Agregar el sueldo quincenal al arreglo
    public void agregarSueldoQuincenal(double sueldo) {
        for (int i = 0; i < sueldoQuincenal.length; i++) {
            if (sueldoQuincenal[i] == 0) {
                sueldoQuincenal[i] = sueldo;
                break;
            }
        }
    }

    // Mostrar los sueldos calculados
    public void mostrarSueldos() {
        System.out.println("Sueldo(s) quincenal(es) del empleado " + nombreEmpleado + ":");
        for (double sueldo : sueldoQuincenal) {
            if (sueldo != 0) {
                System.out.println("$" + sueldo);
            }
        }
    }

    // Método main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado();

        // Datos del empleado
        System.out.print("Ingrese ID de empleado: ");
        int idEmpleado = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese nombre del empleado: ");
        String nombreEmpleado = sc.nextLine();
        System.out.print("Ingrese puesto (Empleado o Supervisor): ");
        String puesto = sc.nextLine();

        // Validar los datos ingresados
        if (empleado.validarDatos(idEmpleado, nombreEmpleado, puesto)) {
            // Ingresar horas extras
            System.out.print("Ingrese horas extras diurnas: ");
            double horasExtrasDiurnas = sc.nextDouble();
            System.out.print("Ingrese horas extras nocturnas: ");
            double horasExtrasNocturnas = sc.nextDouble();

            // Calcular sueldo
            double sueldo = empleado.calcularSueldo(horasExtrasDiurnas, horasExtrasNocturnas);
            empleado.agregarSueldoQuincenal(sueldo);

            // Mostrar sueldos
            empleado.mostrarSueldos();
        } else {
            System.out.println("Datos inválidos. No se puede calcular el sueldo.");
        }

        sc.close();
    }
}

    
