/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author Usuario
 */
public class PromedioEstudiante {

    private String nombreEstudiante;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedioCalificaciones;

    public PromedioEstudiante() {
        nombreEstudiante = "Sofía Pineda";
        materia1 = 8.71;
        materia2 = 9.54;
        materia3 = 9.01;

    }

    public PromedioEstudiante(String nombre, double mat1, double mat2,
            double mat3) {
        nombreEstudiante = nombre;
        materia1 = mat1;
        materia2 = mat2;
        materia3 = mat3;

    }

    public void establecerNombreEstudiante(String c) {
        nombreEstudiante = c;
    }

    public void establecerMateria1(double c) {
        materia1 = c;
    }

    public void establecerMateria2(double c) {
        materia2 = c;
    }

    public void establecerMateria3(double c) {
        materia3 = c;
    }

    public void calcularPromedio() {
        promedioCalificaciones = (materia1 + materia2 + materia3)/3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerMateria1() {
        return materia1;
    }

    public double obtenerMateria2() {
        return materia2;
    }

    public double obtenerMateria3() {
        return materia3;
    }
    public double obtenerPromedio() {
        return promedioCalificaciones;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Nombre del estudiante: %s\n"
                + "Calificación de la materia 1: %.2f\n"
                + "Calificación de la materia 2: %.2f\n"
                + "Calificación de la materia 3: %.2f\n"
                + "Promedio de las calificaciones: %.2f\n",
                obtenerNombreEstudiante(),
                obtenerMateria1(),
                obtenerMateria2(),
                obtenerMateria3(),
                obtenerPromedio());
        return cadena;
    }
}
