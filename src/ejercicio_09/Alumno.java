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
    /**
     * Método que pide las notas del alumno
     * @throws RangoException Se lanza si la nota no está entre 0 y 10
     */
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
    /**
     * Método que recibe una posicion y una nota y cambia la nota de esa posicion
     * @param posicion Posicion de la nota que se quiere cambiar
     * @param nnota Nueva nota introducida
     * @throws RangoException Se lanza si la nota no está entre 0 y 10
     * @throws IndexOutOfBoundsException Se lanza si la posicion está fuera de los límites del array
     */
    public void modificarNota(int posicion, double nnota)throws RangoException, IndexOutOfBoundsException
    {
        System.out.println("posicion"+posicion);
        System.out.println("size"+notas.size());
        if (nnota>=0 && nnota<=10)
        {
            if (posicion<notas.size() && posicion>=0)
            {
                notas.set(posicion, nnota);
            }
            else
            {
                throw new IndexOutOfBoundsException("No se encuentra la posición solicitada");
            }
        }
        else
        {
            throw new RangoException("Nota no válida");
        }
    }
    /**
     * Método que muestra por pantalla el nombre y las notas del alumno
     */
    public void imprimirCalificaciones()
    {
        System.out.println
        (
            "--------------\n" +
            "Calificaciones\n" +
            "Alumno: "+nombre+"\n" +
            "--------------\n" 
        );
        for (int i = 0; i < notas.size(); i++)
        {
            System.out.println("-Nota número "+(i+1)+":"+notas.get(i));
        }
    }
}
