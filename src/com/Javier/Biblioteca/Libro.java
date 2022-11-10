package com.Javier.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Libro {
   //atributos
    private Integer isbn;
    private String titulo;
    private String autor;
    private List<Genero> genero = new ArrayList<>();
    private String fecha_publi;
 //metodos
    public Integer getIsbn() { return isbn;}
    public void setIsbn(Integer isbn) { this.isbn = isbn;}
    public String getTitulo() { return titulo;}
    public void setTitulo(String titulo) { this.titulo = titulo;}
    public String getAutor() { return autor;}
    public void setAutor(String autor) { this.autor = autor;}
    public List<Genero> getGenero() { return this.genero;}
    public void addGenero() { this.genero.add(genero);}
    public String getFecha_publi() { return fecha_publi;}
    public void setFecha_publi(String fecha_publi) { this.fecha_publi = fecha_publi;}
}
