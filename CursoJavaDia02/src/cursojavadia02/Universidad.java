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
public class Universidad {
    public static final String nombre = "UNEG";
    public static final String ubicacion = "Alantico";
    
    private List<Carrera> carreras;

    public Universidad() {
        carreras = new ArrayList<>();
    }

    public Universidad(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        String result = "Nombre : "+nombre+"\nUbicacion : "+
                ubicacion+"\nCarreras : \n";
        for (Carrera carrera : carreras) {
            result += carrera.toString()+"\n";
        }
        
        return result;
    }
    
    
    
}
