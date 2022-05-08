/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

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
        Automotor automotor1 = new Automotor();
        automotor1.calcularValorMatricula();

        Automotor automotor2 = new Automotor("1107984532", "Toyota", 2002, 17712.35);
        automotor2.calcularValorMatricula();

        System.out.printf("Características del automotor 1\n\n%s\n", automotor1);
        
        System.out.println("----------------------------------------");
        
        System.out.printf("Características del automotor 2\n\n%s\n", automotor2);
    }
    
}
