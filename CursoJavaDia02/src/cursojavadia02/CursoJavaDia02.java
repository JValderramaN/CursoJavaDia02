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
        
        Universidad univ = new Universidad();
        Carrera carr = new Carrera();
        carr.setNombre("Ing. Informatica");
        univ.getCarreras().add(carr);
        
        Profesor prof = new Profesor("Ingeniero", 14, "Rafael", 37, 'M');
        
        Materia materia = new Materia();
        materia.setNombre("Programacion");
        
        for (int i = 0; i < 2; i++) {
            Seccion seccion = new Seccion();
            seccion.setNumeroSeccion(i+1);
            seccion.setProfesorAsignado(prof);
            for (int j = 0; j < 2; j++) {
                Estudiante e = new Estudiante("1123",carr.getNombre() , 
                        "estudiante "+j, 20, 'm');
                
                seccion.getEstudiantes().add(e);
            }
            materia.getSecciones().add(seccion);
        }
        
        Pensum pensum = new Pensum();
        pensum.getMaterias().add(materia);
        carr.setPensum(pensum);
        
        
        System.out.println("DATOS \n"+univ.toString());
    }

}
