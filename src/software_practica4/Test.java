/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_practica4;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Examen ex = new Examen();
        Scanner teclado = new Scanner(System.in);
        String Selecciones[],opcion;
        Selecciones = ex.CompletarExamen();
        ex.obtenerNota();   
        
    }
}
