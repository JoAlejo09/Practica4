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
        Menu menu = new Menu();
        boolean opcion;
        ArrayList <Estudiante> estudiantes = new ArrayList();
        Estudiante est = new Estudiante(0, "valeria", "24/12/1997", "valeria@epn","Estudios Sociales","001");
        Estudiante est1 = new Estudiante(1, "brigitte", "24/02/1990", "brigitte@epn","Estudios Sociales","001");
        
        estudiantes.add(est);
        estudiantes.add(est1);
                
        if(menu.menu()== 1)
        {
            opcion=menu.usuarioRegistrado();
            if(opcion) //si esta registrado
            {
                String[] usuarioLogin = menu.login();
                int indiceUsuario =-1;
                
                for(int i =0; i< estudiantes.size(); i++)
                {
                    if (estudiantes.get(i).getNombre().equalsIgnoreCase(usuarioLogin[0]))
                    {
                        indiceUsuario=i;
                        i= estudiantes.size();
                    }
                }
                
                if(indiceUsuario != -1)
                {
                    Examen ex = new Examen();
                    ex.completarExamen();
                    ex.obtenerNota();
                }
                else
                    System.out.println("Usuario no registrado");
                
                /*
                Examen ex = new Examen();
                
                menu.login();
                String selecciones[];
                selecciones = ex.completarExamen();
                ex.obtenerNota();  
                 */
            }
        } 
        /*
        Examen ex = new Examen();
        Scanner teclado = new Scanner(System.in);
        String Selecciones[],opcion;
        Selecciones = ex.completarExamen();
        ex.obtenerNota();   
        */
    }
}
