/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_09;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase alumno
 * @author alexlexu
 */
public class Alumno
{
    private static final int num_asignaturas=5;
    private String nombre;
    private ArrayList<Double> notas = new ArrayList<>();

    /**
     * Constructor por defecto de Alumno
     */
    public Alumno()
    {
        nombre="";
    }
    
    /**
     * Constructor con parámetros de Alumno
     * @param nombre Nombre del alumno
     */
    public Alumno(String nombre)
    {
        this.nombre=nombre;
    }
    
    /**
     * Método get de nombre
     * @return Nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set del nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void pedirNotas() throws RangoException
    {
        Scanner scanner = new Scanner(System.in);
        int contador=0;
        while (notas.size()<num_asignaturas)
        {
            System.out.println("Introduce la nota número "+(contador+1)+" de "+nombre);
            double nota=scanner.nextDouble();
            if (nota>=0 && nota<=10)
            {
                notas.add(nota);
                contador++;
            }
            else
            {
                throw new RangoException("Nota no válida");
            }
            
        }
    }
}
