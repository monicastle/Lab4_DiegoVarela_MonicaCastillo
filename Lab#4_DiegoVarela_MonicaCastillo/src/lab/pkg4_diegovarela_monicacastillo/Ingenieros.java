/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Ingenieros extends Seresv{
    private String correo;
    private String usuario;
    private ArrayList idiomas=new ArrayList();
    private String contraseña;
    private String fecha;

    public Ingenieros(String correo, String usuario, String contraseña, String fecha, String nombre, String sanguineo, String sexo, double altura, double peso) {
        super(nombre, sanguineo, sexo, altura, peso);
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ArrayList getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
