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
public class Profesor extends Persona {

    private String profesion;
    private int añosExperiencia;

    public Profesor(String profesion, int añosExperiencia, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

    public Profesor(String profesion, int añosExperiencia) {
        super();
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

    public Profesor() {
        super();
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nProfesion : " + profesion + "\nAños de esperiencia : "
                + añosExperiencia;
    }

}
