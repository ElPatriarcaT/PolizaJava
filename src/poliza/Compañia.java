/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliza;

/**
 *
 * @author Toni
 */
public class Compañia {

    /**
     * Variables
     */
    String id, nombre;

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param id
     * @param nombre
     */
    public Compañia(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

}
