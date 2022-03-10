package model;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID id;
    private String titulo;
    private Date fecha;
    private boolean resuelto;

    public Crime() {
        id = UUID.randomUUID();
        fecha = new Date();
    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

}