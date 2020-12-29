/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_practica4;

import java.util.Scanner;

/**
 *
 * @author valer
 */
public class Menu {
    
    public int menu()
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
    
    public int usuarioRegistrado()
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\t=================================");
        System.out.println("¿Se encuentra usted registrado en TuAcademY?");
        System.out.println("0) Si\n1) No");
        
       return teclado.nextInt();
    }
    
    public String[] login()
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
}
