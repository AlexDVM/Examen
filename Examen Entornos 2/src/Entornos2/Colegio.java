
package Entornos2;

import java.util.ArrayList;

/**
 * 
 * @author Alex del valle
 * Clase colegio para utilizar los metodos
 */
public class Colegio {

     

    private ArrayList<String> asignaturas;
    private ArrayList<String> gente;

    /**
     * 
     * @param asignaturas
     * @param gente 
     */
    public Colegio(ArrayList<String> asignaturas, ArrayList<String> gente) {
        this.asignaturas = asignaturas;
        this.gente = gente;
    }

    public ArrayList<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public ArrayList<String> getGente() {
        return gente;
    }

    public void setGente(ArrayList<String> gente) {
        this.gente = gente;
    }
    

    /**
     * Guarda todos los datos en fichero
     * 
     */
    public void guardarDatos(){
    }
    
    
    /**
     *carga todos los datos del fichero
     */
    public void cargarFicheros(){
        
    }
    
    /**
     *Lista todos los profesores
     */
    public void listarProfesores(){
        
    }
    /**
     *Lista todos los alumnos
     */
    public void listarAlumnos(){

    }
        
    /**
     *permite dar de alta una asignatura
     */
    public void altaAsignatura(){
          
    }
        
    /**
     *Permite matricular alumnos
     */
    public void matricularAlumno(){   
    }
    
    /**
     *Muestra la cantidad de asignaturas que imparte un profesor
     * @param asignaturas
     * @return 
     */
    public int asignaturasImpartidas(int asignaturas){
        return asignaturas = 0;
    }    
    
    
    /**
     *Muestra la asignatura con mas matriculaciones
     * @param matricula
     * @return 
     */
    public String masMatriculaciones(String matricula){
        return matricula;
    }
   
}
   


        
    


