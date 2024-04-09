
package Entornos2;

import java.time.LocalDate;


public class Alumno extends Persona {
    private LocalDate fechaMatriculacion;
    private String nacionalidad;
    
    /**
     * 
     * @param fechaMatriculacion
     * @param nacionalidad
     * @param dni
     * @param nombre 
     */
    public Alumno(LocalDate fechaMatriculacion, String nacionalidad, String dni, String nombre) {
        super(dni, nombre);
        this.fechaMatriculacion = fechaMatriculacion;
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
}
