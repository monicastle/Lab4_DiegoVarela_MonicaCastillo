/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_diegovarela_monicacastillo;

/**
 *
 * @author diego
 */
public class Seresv {
    private String nombre;
    private String sanguineo;
    private String sexo;
    private double altura;
    private double peso;

    public Seresv(String nombre, String sanguineo, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.sanguineo = sanguineo;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSanguineo() {
        return sanguineo;
    }

    public void setSanguineo(String sanguineo) {
        this.sanguineo = sanguineo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Seresv{" + "nombre=" + nombre + ", sexo=" + sexo + '}';
    }
    
}
