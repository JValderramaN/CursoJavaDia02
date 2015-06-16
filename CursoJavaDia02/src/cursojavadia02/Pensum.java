/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavadia02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vanguardia Admin
 */
public class Pensum {
    private List<Materia> materias;

    public Pensum(List<Materia> materias) {
        this.materias = materias;
    }

    public Pensum() {
        materias = new ArrayList<>();
    }
    
    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        String result = "Materias : \n";
        for (Materia materia : materias) {
            result += materia.toString()+"\n";
        }
        return result;
    }
}
