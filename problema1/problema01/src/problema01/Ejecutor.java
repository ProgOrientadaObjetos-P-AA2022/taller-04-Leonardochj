/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

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
        PromedioEstudiante estudiante1 = new PromedioEstudiante();
        estudiante1.calcularPromedio();

        PromedioEstudiante estudiante2 = new PromedioEstudiante
        ("Sebastián Álvarez", 9.10, 6.12, 8.34);
        estudiante2.calcularPromedio();

        System.out.printf("Notas del estudiante 1\n%s\n", estudiante1);
        
        System.out.println("----------------------------------------");
        
        System.out.printf("Notas del estudiante 2\n%s\n", estudiante2);
        
    }
    
}
