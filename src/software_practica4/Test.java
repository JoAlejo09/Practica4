/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_practica4;
import java.util.ArrayList;
import java.util.Iterator;
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
        
        boolean opcion;
        ArrayList <Estudiante> estudiantes = new ArrayList();
        Estudiante est = new Estudiante(0, "valeria", "24/12/1997", "valeria@epn","Estudios Sociales","001");
        Estudiante est1 = new Estudiante(1, "brigitte", "24/02/1990", "brigitte@epn","Estudios Sociales","001");
       
        
        estudiantes.add(est);
        estudiantes.add(est1);
                
        if(menu()== 1)
        {
            opcion=usuarioRegistrado();
            if(opcion) //si esta registrado
            {
                String[] usuarioLogin = login();
                int indiceUsuario =-1;
                
                if(est.existeEstudiante(estudiantes, usuarioLogin[0]) != -1)
                {
                    Examen ex = new Examen();
                    ex.completarExamen();
                    ex.obtenerNota();
                }
                else
                    System.out.println("Usuario no registrado");              
            }
        } 
    }
    
 
      public static String[] login()
    {
        Scanner teclado = new Scanner(System.in);
        String valores[] = new String[2];
        
        System.out.println("\t=================================");
        System.out.println("\t-------------Login---------------");
        System.out.println("Ingrese su nombre");
        valores[0]=teclado.nextLine();
        System.out.println("Ingrese su email");
        valores[1]=teclado.nextLine();
        
        return valores;
    }
    
       public static int menu()
    {
        Scanner teclado = new Scanner(System.in);
        int devolver;
        
        System.out.println("\t=================================");
        System.out.println("\t-----------TuAcademy!------------");
        System.out.println("\t------------ M e n u ------------");
        System.out.println("1)Rendir Examen");
        
        devolver = Integer.parseInt(teclado.nextLine());
        return devolver;
        
    
    }
    
    public static boolean usuarioRegistrado()
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\t=================================");
        System.out.println("¿Se encuentra usted registrado en TuAcademY?");
        System.out.println("0) Si\n1) No");
        
       return (teclado.nextInt()==0);
    }
    
}
