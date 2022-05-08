/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author Usuario
 */
public class Profesor {
    private String nombreProfesor;
    private String apellidoProfesor;
    private double sueldoBasico;
    private String cedula;
    private double sueldoTotal;

    public Profesor() {
        nombreProfesor = "Patricia";
        apellidoProfesor = "Escarabay";
        sueldoBasico = 310.42;
        cedula = "1198043965";

    }

    public Profesor(String nombre, String apellido, double sueldo, String cl) {
        nombreProfesor = nombre;
        apellidoProfesor = apellido;
        sueldoBasico = sueldo;
        cedula = cl;

    }

    public void establecerNombreProfesor(String c) {
        nombreProfesor = c;
    }

    public void establecerApellidoProfesor(String c) {
        apellidoProfesor = c;
    }

    public void establecerSueldoBasico(double c) {
        sueldoBasico = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + ((sueldoBasico * 20)/100);
    }

    public String obtenerNombreProfesor() {
        return nombreProfesor;
    }

    public String obtenerApellidoProfesor() {
        return apellidoProfesor;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public String obtenerCedula() {
        return cedula;
    }
    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Nombre del profesor: %s\n"
                + "Apellido del profesor: %s\n"
                + "Sueldo básico: %.2f\n"
                + "Cédula: %s\n"
                + "Sueldo total: %.2f\n",
                obtenerNombreProfesor(),
                obtenerApellidoProfesor(),
                obtenerSueldoBasico(),
                obtenerCedula(),
                obtenerSueldoTotal());
        return cadena;
    }
}
