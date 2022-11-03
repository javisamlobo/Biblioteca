package com.Javier.Biblioteca;

import java.util.Date;

public class Libro {
   //atributos
    private Integer isbn;
    private String titulo;
    private String autor;
    private String genero;
    private Date fecha_publi;
 //metodos
    public Integer getIsbn() { return isbn;}
    public void setIsbn(Integer isbn) { this.isbn = isbn;}
    public String getTitulo() { return titulo;}
    public void setTitulo(String titulo) { this.titulo = titulo;}
    public String getAutor() { return autor;}
    public void setAutor(String autor) { this.autor = autor;}
    public String getGenero() { return genero;}
    public void setGenero(String genero) { this.genero = genero;}
    public Date getFecha_publi() { return fecha_publi;}
    public void setFecha_publi(Date fecha_publi) { this.fecha_publi = fecha_publi;}
}
