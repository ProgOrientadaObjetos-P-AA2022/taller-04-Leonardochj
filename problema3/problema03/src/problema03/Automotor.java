/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author Usuario
 */
public class Automotor {
    private String cedulaDueño;
    private String marcaVehiculo;
    private int añoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor() {
        cedulaDueño = "1102759432";
        marcaVehiculo = "KIA";
        añoFabricacion = 2012;
        valorVehiculo = 20410.45;

    }

    public Automotor(String cedula, String marca, int año, double valor) {
        cedulaDueño = cedula;
        marcaVehiculo = marca;
        añoFabricacion = año;
        valorVehiculo = valor;

    }

    public void establecerCedulaDueño(String c) {
        cedulaDueño = c;
    }

    public void establecerMarcaVehiculo(String c) {
        marcaVehiculo = c;
    }

    public void establecerAñoFabricacion(int c) {
        añoFabricacion = c;
    }

    public void establecerValorVehiculo(double c) {
        valorVehiculo = c;
    }

    public void calcularValorMatricula() {
        valorMatricula = añoFabricacion * ((valorVehiculo * 0.002)/100);
    }

    public String obtenerCedulaDueño() {
        return cedulaDueño;
    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAñoFabricacion() {
        return añoFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }
    public double obtenerValorMatricula() {
        return valorMatricula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Cédula del dueño: %s\n"
                + "Marca del vahículo: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehículo: %.2f\n"
                + "Valor de la matrícula: %.2f\n",
                obtenerCedulaDueño(),
                obtenerMarcaVehiculo(),
                obtenerAñoFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }
}
