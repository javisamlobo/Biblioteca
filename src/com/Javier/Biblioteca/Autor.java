package com.Javier.Biblioteca;

import java.util.Date;

public class Autor {
    //Atributos
    private Integer id;
    private String nombre;
    private String apellidos;
    private String fecha_nac;
    private String lugar_nac;
    //Metodos
    public Integer getId() { return id;}
    public void setId(Integer id) { this.id = id;}
    public String getNombre() { return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre;}
    public String getApellidos() { return apellidos;}
    public void setApellidos(String apellidos) { this.apellidos = apellidos;}
    public String getFecha_nac() { return fecha_nac;}
    public void setFecha_nac(String fecha_nac) { this.fecha_nac = fecha_nac;}
    public String getLugar_nac() { return lugar_nac;}
    public void setLugar_nac(String lugar_nac) { this.lugar_nac = lugar_nac;}

}
