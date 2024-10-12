/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author DELL
 */
public class Suscripcion {
          private long idSuscripcion; // PRIMARY KEY
    private String fechaDeSuscripcion;
    private long idRevista; // FOREIGN KEY a Revista
    private long idUsuario; // FOREIGN KEY a Usuario
    private boolean activo;
    private boolean meGusta;

    public long getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(long idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getFechaDeSuscripcion() {
        return fechaDeSuscripcion;
    }

    public void setFechaDeSuscripcion(String fechaDeSuscripcion) {
        this.fechaDeSuscripcion = fechaDeSuscripcion;
    }

    public long getIdRevista() {
        return idRevista;
    }

    public void setIdRevista(long idRevista) {
        this.idRevista = idRevista;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isMeGusta() {
        return meGusta;
    }

    public void setMeGusta(boolean meGusta) {
        this.meGusta = meGusta;
    }

    public Suscripcion() {
    }

    public Suscripcion(long idSuscripcion, String fechaDeSuscripcion, long idRevista, long idUsuario, boolean activo, boolean meGusta) {
        this.idSuscripcion = idSuscripcion;
        this.fechaDeSuscripcion = fechaDeSuscripcion;
        this.idRevista = idRevista;
        this.idUsuario = idUsuario;
        this.activo = activo;
        this.meGusta = meGusta;
    }
    
    
}
