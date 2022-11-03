package com.Javier.Biblioteca;

public class Usuario {
    //Atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private String fecha_nac;
    private Integer telefono;
    private String direccion;
    private String poblacion;

    //Metodos
    public String getDni() { return dni;}
    public void setDni(String dni) { this.dni = dni;}
    public String getNombre() { return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre;}
    public String getApellidos() { return apellidos;}
    public void setApellidos(String apellidos) { this.apellidos = apellidos;}
    public String getFecha_nac() { return fecha_nac;}
    public void setFecha_nac(String fecha_nac) { this.fecha_nac = fecha_nac;}
    public Integer getTelefono() { return telefono;}
    public void setTelefono(int i) { this.telefono = telefono;}
    public String getDireccion() { return direccion;}
    public void setDireccion(String direccion) { this.direccion = direccion;}
    public String getPoblacion() { return poblacion;}
    public void setPoblacion(String poblacion) { this.poblacion = poblacion;}

}
