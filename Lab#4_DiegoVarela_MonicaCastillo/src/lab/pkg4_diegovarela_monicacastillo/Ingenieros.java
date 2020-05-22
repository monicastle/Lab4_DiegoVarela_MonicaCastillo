/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Ingenieros extends Seresv {

    private String correo;
    private String usuario;
    private ArrayList idiomas = new ArrayList();
    private String contraseña;
    private Date fecha;

    public Ingenieros(String correo, String usuario, String contraseña, Date fecha, String nombre, String sanguineo, String sexo, double altura, double peso) {
        super(nombre, sanguineo, sexo, altura, peso);
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecha = fecha;
    } // Fin Constructor Ingenieros

    public String getCorreo() {
        return correo;
    } // Fin Get Correo

    public void setCorreo(String correo) {
        this.correo = correo;
    } // Fin Set Correo

    public String getUsuario() {
        return usuario;
    } // Fin Get Usuario

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    } // Fin Set Usuario

    public ArrayList getIdiomas() {
        return idiomas;
    } // Fin Get Idiomas

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    } // Fin Set Idiomas

    public String getContraseña() {
        return contraseña;
    } // Fin Get Contraseñas

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    } // Fin Set Contraseña

    public Date getFecha() {
        return fecha;
    } // Fin Get Fecha

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    } // Fin Set Fecha

} // Fin Ingenieros
