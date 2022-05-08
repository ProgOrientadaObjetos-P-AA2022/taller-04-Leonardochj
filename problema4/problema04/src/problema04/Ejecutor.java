/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Financiera cheque1 = new Financiera();
        cheque1.calcularValorComisionBanco();

        Financiera cheque2 = new Financiera("Andres Jaramillo", "Banco de Loja", 
                1200.32);
        cheque2.calcularValorComisionBanco();

        System.out.printf("Propiedades del cheque 1\n\n%s\n", cheque1);
        
        System.out.println("----------------------------------------");
        
        System.out.printf("Propiedades del cheque 2\n\n%s\n", cheque2);
    }
    
}
