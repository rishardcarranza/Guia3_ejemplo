package org.dev4u.hv.guia3_ejemplo;

/**
 * Created by rishardcarranza on 09-04-17.
 */

public class Mensaje {

    private String fecha;
    private String contenido;

    public Mensaje(String fecha, String contenido) {
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
