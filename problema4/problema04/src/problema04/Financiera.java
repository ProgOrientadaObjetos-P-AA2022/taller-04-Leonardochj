/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema04;

/**
 *
 * @author Usuario
 */
public class Financiera {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Financiera() {
        nombreCliente = "Ramiro Quezada";
        nombreBanco = "Banco Pichincha";
        valorCheque = 10220.30;
    }

    public Financiera(String cliente, String banco, double cheque) {
        nombreCliente = cliente;
        nombreBanco = banco;
        valorCheque = cheque;
    }

    public void establecerNombreCliente(String c) {
        nombreCliente = c;
    }

    public void estableceNombreBanco(String c) {
        nombreBanco = c;
    }

    public void establecerAñoFabricacion(double c) {
        valorCheque = c;
    }

    public void calcularValorComisionBanco() {
        comisionBanco = valorCheque * ((valorCheque * 0.003) / 100);
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerValorComisionBanco() {
        return comisionBanco;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Valor de la comisión que cobra el banco: %.2f\n",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerValorComisionBanco());
        return cadena;
    }
}
