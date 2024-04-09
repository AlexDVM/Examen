
package Entornos2;

/**
 * 
 * @author Alex del Valle
 * clase Persona con datos en comun entre profesor y alumno
 */
public abstract class Persona {
    private String dni;
    private String nombre;

    //getters y seters
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
    *  
     * @param dni
     * @param nombre
    */
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
}
