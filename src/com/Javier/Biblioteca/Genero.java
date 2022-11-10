package com.Javier.Biblioteca;

public class Genero implements temas{
    //Atributos
    private Integer id;
    private String nombre;
    private String descripcion;
    //Metodos

    public void setId(Integer id) { this.id = id;}

    public void setNombre(String nombre) { this.nombre = nombre;}

    public void setDescripcion(String descripcion) { this.descripcion = descripcion;}

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
}
