
package Entornos2;


public class Asignatura {
    /**
     * 
     */
    private int codigo; //codigo de la asignatura en INT
    private String nombre; // nombre de la asignatura en String
    private int horasanuales;  //horas anuales de la asignatura en INT
    
    
    //getter y seter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasanuales() {
        return horasanuales;
    }

    public void setHorasanuales(int horasanuales) {
        this.horasanuales = horasanuales;
    }
    //constructor de asignatura
    /**
     * 
     * @param codigo
     * @param nombre
     * @param horasanuales 
     */
    public Asignatura(int codigo, String nombre, int horasanuales) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasanuales = horasanuales;
    }
    
   
    
}
