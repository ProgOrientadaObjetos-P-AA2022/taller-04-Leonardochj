/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

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
        Profesor profesor1 = new Profesor();
        profesor1.calcularSueldoTotal();

        Profesor profesor2 = new Profesor("Milton", "Huaca", 350.54, "1104765403");
        profesor2.calcularSueldoTotal();

        System.out.printf("Características del profesor 1\n\n%s\n", profesor1);
        
        System.out.println("----------------------------------------");
        
        System.out.printf("Características del profesor 2\n\n%s\n", profesor2);
        
    }
    
}
