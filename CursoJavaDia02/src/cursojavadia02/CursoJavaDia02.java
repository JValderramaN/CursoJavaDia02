/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavadia02;

/**
 *
 * @author Vanguardia Admin
 */
public class CursoJavaDia02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per1 = new Persona("jose", 22, 'm');

        Estudiante e1 = new Estudiante("22312311",
                "Ing. Infomatica", per1.getNombre(), per1.getEdad(),
                per1.getSexo());

        Profesor pro1 = new Profesor("Ingeniero", 14,
                per1.getNombre(), per1.getEdad(), per1.getSexo());

    }

}
