package com.Javier.Biblioteca;

public class Prestamo {
    //Atributos
    private Integer id;
    private Libro isbn;
    private Usuario dni;
    private String fecha_pres;
    private String fecha_devo;

    //Metodos

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Libro getLibro(){
        return isbn;
    }
    public void setLibro(){
        this.isbn = isbn;
    }

    public Usuario getUsuario() {
        return dni;
    }
    public void setUsuario(){
        this.dni = dni;
    }
    public String getFecha_pres(){
        return fecha_pres;
    }

    public void setFecha_pres(String fecha_pres) {
        this.fecha_pres = fecha_pres;
    }

    public String getFecha_devo() {
        return fecha_devo;
    }

    public void setFecha_devo(String fecha_devo) {
        this.fecha_devo = fecha_devo;
    }
}
