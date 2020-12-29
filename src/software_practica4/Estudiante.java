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

public class Estudiante {
    
    private int codigo;
    private String nombre;
    private String fechaNacimiento;
    private String correo;
    private Curso curso;
    
    public String getNombre() {
        return nombre;
    }

    public Estudiante(int codigo, String nombre, String fecha, String correo, String materia, String codigoMateria)
    {
        registrarEstudiante(codigo, nombre, fecha, correo);
        curso = new Curso(materia, codigoMateria);
        
    }
    
    public int existeEstudiante(ArrayList<Estudiante> est, String nombre)
    {
        for (int i =0; i<est.size(); i++)
        {
            if(est.get(i).getNombre().equalsIgnoreCase(nombre))
                return i;
        }
        return -1;
    }
    /*
    public void formularioEstudiante()
    {
        String valores[] = new String[4];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("----------------------------------\n");
        System.out.println("-----Registro Estudiante-----------\n");
        System.out.println("1) Ingrese codigo");
        valores[0]=teclado.nextLine();
        System.out.println("2) Ingrese nombre");
        valores[1]=teclado.nextLine();
        System.out.println("3) Ingrese fecha");
        valores[2]=teclado.nextLine();
        System.out.println("4) Ingrese correo");
        valores[3]=teclado.nextLine();
        
        registrarEstudiante(Integer.parseInt(valores[0]),valores[1],valores[2],valores[3]);
        System.out.println("\t Estudiante registrado con éxito");
    }
    */
    public void registrarEstudiante(int codigo, String nombre, String fecha, String correo)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaNacimiento = fecha;
        this.correo = correo;
    }

}
