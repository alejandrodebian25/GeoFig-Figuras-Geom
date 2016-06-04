package com.example.alejandro.figurasgeometricas;

/**
 * Created by Alejandro on 07/05/2016.
 */
public class Figura {

    private int icono;
    private String nombre;

    public Figura(){
        super();
    }

    public Figura(int icon,String nombre){
        super();
        this.icono=icon;
        this.nombre=nombre;
    }

    //getttes and setter
    public int getIcono() {
        return icono;
    }
    public void setIcono(int icono) {
        this.icono = icono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
