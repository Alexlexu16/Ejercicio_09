/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_09;

/**
 *
 * @author alexlexu
 */
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Alumno alumno = new Alumno("Tomás Pepe");
        try{
            alumno.pedirNotas();
            alumno.modificarNota(3, 7.8);
            alumno.imprimirCalificaciones();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
}
