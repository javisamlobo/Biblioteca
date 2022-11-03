package com.Javier.Biblioteca;

import java.util.Date;

public class Prestamo {
    //Atributos
    private Integer id;
    private String libro;
    private String usuario;
    private Date fecha_pres;
    private Date fecha_devo;

    //Metodos
    public Integer getId() { return id;}
    public void setId(Integer id) { this.id = id;}
    public String getLibro() { return libro;}
    public void setNombre(String nombre) { this.nombre = nombre;}
}
