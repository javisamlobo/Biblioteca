package com.Javier.Biblioteca;

import java.util.Date;

public class Autor {
    //Atributos
    private Integer id;
    private String nombre;
    private String apellido;
    private Date fecha_nac;
    private String lugar_nac;
    //Metodos
    public Integer getId() { return id;}
    public void setId(Integer id) { this.id = id;}
    public String getNombre() { return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre;}
    public String getApellido() { return apellido;}
    public void setApellido(String apellido) { this.apellido = apellido;}
    public Date getFecha_nac() { return fecha_nac;}
    public void setFecha_nac(Date fecha_nac) { this.fecha_nac = fecha_nac;}
    public String getLugar_nac() { return lugar_nac;}
    public void setLugar_nac(String lugar_nac) { this.lugar_nac = lugar_nac;}

}
